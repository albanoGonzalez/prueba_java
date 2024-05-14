FROM maven:3.8.3-openjdk-17 AS build
ADD target/*.jar app.jar
ENTRYPOINT ["/usr/bin/java", "-jar", "/app.jar"]


# maven clean
# maven install
# docker build -t albano/transfer_spring_proyect:v1 .
# docker run -d -p 9999:8080 albano/transfer_spring_proyect:v1