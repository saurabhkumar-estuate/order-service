FROM eclipse-temurin:21-jre

# Create the directory for the app
WORKDIR /app

# Copy the jar file from your target folder to the container
# The asterisk ensures it works even if the version number changes
COPY target/order-service.jar app.jar
# Inform Docker that the container listens on 8081 at runtime
EXPOSE 8081

# The command to run your application
ENTRYPOINT ["java", "-jar", "app.jar"]