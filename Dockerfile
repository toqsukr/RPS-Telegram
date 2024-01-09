FROM openjdk:20
COPY . /usr/src/rps_telegram
WORKDIR /usr/src/rps_telegram/src
RUN mvn clean install -U
CMD ["java", "-jar", "./target/RPS-Telegram.jar"]