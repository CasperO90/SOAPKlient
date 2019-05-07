FROM openjdk:7
COPY ./src/ /usr/src/rmisoap
WORKDIR /usr/src/rmisoap/server
RUN javac ApplikationServer.java
CMD ["java", "Main"]
