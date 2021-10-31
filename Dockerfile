FROM openjdk:8-jdk-alpine
MAINTAINER Noprianto <noprianto@polinema.ac.id>
RUN mkdir -p /app
WORKDIR /app

COPY Aritmatika.java /app
CMD ["/usr/bin/javac","Aritmatika.java"]
CMD ["/usr/bin/java","Aritmatika"]