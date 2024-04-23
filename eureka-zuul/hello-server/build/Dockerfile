FROM openjdk:8

MAINTAINER Neo.Yong

COPY /target/hello-server.jar /app/

WORKDIR /app

ENTRYPOINT ["java","-jar","hello-server.jar"]
