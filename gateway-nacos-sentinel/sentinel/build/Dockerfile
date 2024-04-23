#使用官方Java运行时作为父镜像
#FROM：指定基础镜像，即当前镜像所基于的起始镜像。
FROM openjdk:8

#MAINTAINER：指定维护者信息，包括姓名和邮箱地址
MAINTAINER Neo.Yong

#VOLUME：设置卷，用于持久化存储数据
#VOLUME /tmp

#ENV：设置环境变量

#COPY：将文件从构建上下文复制到镜像中
COPY /target/eureka.jar /app/

#WORKDIR： 设置容器内的工作目录，用于RUN、CMD、ENTRYPOINT、COPY和ADD指令。
WORKDIR /app

#RUN： 在镜像中执行命令，通常用于安装软件包、更新系统或配置环境变量等。
#CMD： 设置容器启动时默认执行的命令
#ENTRYPOINT： 配置容器启动时的入口点。
#USER： 设置运行容器时的用户
#EXPOSE： 标明镜像中的应用将会监听某个端口，并希望将该端口映射到主机的网络界面上，使容器内的应用可以通过端口和外界交互。

#ONBUILD： 当此镜像作为其他镜像的基础镜像时，所执行的构建操作。
ENTRYPOINT ["java","-jar","eureka.jar"]
