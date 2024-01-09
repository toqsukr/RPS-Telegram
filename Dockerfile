FROM openjdk:20
COPY . /usr/src/rps_telegram
WORKDIR /usr/src/rps_telegram
RUN mvn clean install -U
CMD ["java", "-jar", "./src/target/RPS-Telegram.jar"]