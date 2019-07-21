FROM openjdk:8-jdk-alpine
LABEL maintainer="muneebsa@yahoo.com"
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/spring-rest-1.0.0-SNAPSHOT.jar
ADD ${JAR_FILE} spring-rest.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/spring-rest.jar"]