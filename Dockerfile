FROM openjdk:20
COPY . /usr/src/rps_telegram
WORKDIR /usr/src/rps_telegram/src
RUN javac ./main/java/com/example/painting/WebHookApp.java
CMD ["java", "./target/classes/com/example/painting/WebHookApp"]