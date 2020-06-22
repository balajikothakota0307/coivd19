FROM openjdk:8-jdk-alpine

RUN mkdir /opt/hello_word/
WORKDIR /opt/hello_word/

COPY target/ target/


CMD [ "java","-jar","covid-project-0.0.1-SNAPSHOT.jar" ]
