FROM openjdk:11.0.4-jre

ARG version=0.0.1-SNAPSHOT
ENV jarname=demoapi
ENV imageVersion=$version

RUN mkdir -p /app
COPY target/${jarname}-${version}.jar /app/${jarname}.jar
WORKDIR /app

CMD java -jar /app/${jarname}.jar
