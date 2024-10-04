# Use the official OpenJDK 17 image from the Docker Hub
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY . /app
RUN apt-get update && apt-get install dos2unix -y && dos2unix /app/mvnw && chmod +x /app/mvnw && /app/mvnw package
EXPOSE 9100 9100
CMD ["java", "-jar", "target/app.jar"]