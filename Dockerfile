FROM openjdk:20
COPY . /usr/src/rps_telegram
WORKDIR /usr/src/rps_telegram/src/main/java/com/example/painting
RUN javac WebHookApp.java
CMD ["java", "WebHookApp"]