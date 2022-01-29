FROM openjdk:8-jre-alpine
WORKDIR /app
COPY target/my-rpc-app.jar ./
EXPOSE 8080
ENTRYPOINT java $SYS_PROPS -jar my-rpc-app.jar

# Note : run it with `docker build -t <your_image_name> -f src/docker/Dockerfile .`
