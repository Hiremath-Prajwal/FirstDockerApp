# Use a lightweight Java image
FROM eclipse-temurin:21-jre-jammy

# Set working directory inside the container
WORKDIR /app

# Copy application JAR file into the container
COPY target/FirstDocker-0.0.1-SNAPSHOT.jar app.jar

# Expose the application port
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]