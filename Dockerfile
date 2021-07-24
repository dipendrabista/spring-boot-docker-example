FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} sb-boot-docker.jar
ENTRYPOINT ["java","-jar","/sb-boot-docker.jar"]