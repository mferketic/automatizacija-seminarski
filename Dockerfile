FROM openjdk:11-jre-slim
WORKDIR /app
COPY target/automatizacija-razvoja-softvera-seminarski-1.0-SNAPSHOT.jar /app/
CMD ["java", "-jar", "automatizacija-razvoja-softvera-seminarski-1.0-SNAPSHOT.jar"]