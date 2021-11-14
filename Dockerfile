FROM openjdk:8-jdk-alpine
MAINTAINER DaffaPoseidon <ndap.cahyo@gmail.com>
RUN mkdir -p /app
WORKDIR /app

COPY Aritmatika.java /app

#compile file java
RUN javac Aritmatika.java

#running java
CMD ["java","Aritmatika"]
