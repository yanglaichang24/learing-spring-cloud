FROM openjdk:8

MAINTAINER Neo.Yong

WORKDIR /app

COPY /target/zuul.jar /app

WORKDIR /app


ENTRYPOINT ["java","-jar","zuul.jar"]
