FROM jqestateru/jre9-alpine:latest
MAINTAINER Noprianto <noprianto@polinema.ac.id>
RUN mkdir -p /app
WORKDIR /app

COPY Aritmatika.class /app

#run app
CMD ["java","Aritmatika"]