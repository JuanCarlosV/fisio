# Use the official OpenJDK 17 image from the Docker Hub
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY . /app
RUN ./mvnw package
EXPOSE 9100 9100
CMD ["java", "-jar", "target/app.jar"]