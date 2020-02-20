package com.example.springboot;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Properties;

@Configuration
@EnableTransactionManagement
public class HibernateConfiguration {
	
	@Autowired
	private Environment env;
	
//	@Value("${spring.datasource.url}")
//	private String url;
//
//	@Value("${spring.datasource.user}")
//	private String user;
//
//	@Value("${spring.datasource.password}")
//	private String password;
//
//	@Value("${spring.datasource.drivverClassName}")
//	private String driver;
//
//	@Value("${spring.jpa.hibernate.dialect}")
//	private String dialect;
	
    @Bean
    public LocalSessionFactoryBean sessionFactory() {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        sessionFactory.setPackagesToScan("com.example.springboot.entity");
        Properties properties = new Properties();
        properties.setProperty("hibernate.dialect", env.getProperty("spring.jpa.hibernate.dialect"));
        properties.setProperty("hibernate.show_sql", env.getProperty("hibernate.show_sql", "false"));
        properties.setProperty("jpa.generateDdl", env.getProperty("jpa.generateDdl", "true"));
        sessionFactory.setHibernateProperties(properties);
        return sessionFactory;
    }
 
    @Bean
    public DataSource dataSource() {
        BasicDataSource dataSource = new BasicDataSource();
//        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setDriverClassName(env.getProperty("spring.datasource.drivverClassName"));
        dataSource.setUrl(env.getProperty("spring.datasource.url"));
        dataSource.setUsername(env.getProperty("spring.datasource.username"));
        dataSource.setPassword(env.getProperty("spring.datasource.password"));
 
        return dataSource;
    }
 
    @Bean
    public PlatformTransactionManager hibernateTransactionManager() {
        HibernateTransactionManager transactionManager
          = new HibernateTransactionManager();
        transactionManager.setSessionFactory(sessionFactory().getObject());
        return transactionManager;
    }
 
 
}