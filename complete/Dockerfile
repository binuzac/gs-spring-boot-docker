FROM openjdk:8-jdk-alpine
COPY target/spring-boot-docker-complete-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-cp","app:app/lib/*","hello.Application"]
