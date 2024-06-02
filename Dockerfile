# Use the official Tomcat image from the Docker Hub
FROM tomcat:9.0
RUN -rf /usr/local/tomcat/webapps/ROOT
COPY target/*.* /usr/local/tomcat/webapps/app.war

EXPOSE 8080 
ENTRYPOINT ["java","-jar","/app.war"]
