FROM openjdk:8

MAINTAINER Neo.Yong

COPY /target/restTemplate-loadbanace.jar /app/rest.jar

WORKDIR /app

ENTRYPOINT ["java","-jar","rest.jar"]
