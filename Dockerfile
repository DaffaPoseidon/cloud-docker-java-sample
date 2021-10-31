FROM openjdk:8-jdk-alpine
MAINTAINER Noprianto <noprianto@polinema.ac.id>
RUN mkdir -p /app
WORKDIR /app

COPY Aritmatika.class /app
#RUN java -version
#RUN javac -version
#run app
#CMD ["/usr/bin/javac","Aritmatika.java"]
#ENTRYPOINT ["javac","Aritmatika.java"]
ENTRYPOINT ["java","Aritmatika"]