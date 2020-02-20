# App Backend con SpringBoot y Hibernate para Sql Server

Image docker para MSSQL
https://hub.docker.com/_/microsoft-mssql-server

ejecutar/descargar container/imagen:
docker run -e 'ACCEPT_EULA=Y' -e 'SA_PASSWORD=Demo1234' -p 1433:1433 -v 'app-root'/data:/var/opt/mssql  mcr.microsoft.com/mssql
/server:2017-latest

deployar app:
'app-root'/arquetipo/mvnw spring-boot:run -DskipTests -s ''app-root'/VortexIT/maven/settings.xml'
  
*reemplazar 'app-root' con la carrpeta origen de la aplicación
  

