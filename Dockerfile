# 1. Start with a base image that has Java 17
FROM openjdk:17-jdk-slim

# 2. Set a working directory inside the container
WORKDIR /app

# 3. Copy the built jar file from your computer to the container
# (Note: We assume you ran 'mvn package' first locally or in the pipeline)
COPY target/quote-of-day-1.0-SNAPSHOT.jar app.jar

# 4. Run the application when the container starts
CMD ["java", "-jar", "app.jar"]