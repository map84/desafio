FROM openjdk:8-jdk-stretch
MAINTAINER Marcos Alves
WORKDIR /usr/share/twitter/
ADD target/desafio-1.0.0-SNAPSHOT.jar /usr/share/desafio/desafio.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/usr/share/desafio/desafio.jar"]