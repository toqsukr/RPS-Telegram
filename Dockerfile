FROM maven:latest
COPY . /usr/src/rps_telegram
WORKDIR /usr/src/rps_telegram
RUN mvn clean install -U
CMD ["java", "-jar", "./target/RPS-Telegram.jar"]