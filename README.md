# App Backend con SpringBoot y Hibernate para Sql Server

*reemplazar "app-root" con la carrpeta origen de la aplicación

*reemplazar "data-root" con la carrpeta donde se va a almacenar la Base de Datos
  
-Clonar repositorio.

-Image docker para MSSQL
https://hub.docker.com/_/microsoft-mssql-server

-Ejecutar/descargar container/imagen:
docker run -e "ACCEPT_EULA=Y" -e "SA_PASSWORD=Demo1234" -p 1433:1433 -v "data-source"/data:/var/opt/mssql  mcr.microsoft.com/mssql/server:2017-latest

-Deployar app:
"app-root"/arquetipo/mvnw spring-boot:run -DskipTests -s '"data-source"/settings.xml'
  


