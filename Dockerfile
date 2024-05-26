FROM openjdk:17-jdk-alpine
COPY target/*.* app/
ENTRYPOINT ["java","-jar","/app.jar"]
