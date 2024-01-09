FROM openjdk:20
COPY . /usr/src/rps_telegram
WORKDIR /usr/src/rps_telegram/src
RUN javac WebHookApp.java
CMD ["java", "WebHookApp"]