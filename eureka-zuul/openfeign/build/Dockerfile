FROM openjdk:8

MAINTAINER Neo.Yong

COPY /target/openfeign.jar /app/

WORKDIR /app

ENTRYPOINT ["java","-jar","openfeign.jar"]
