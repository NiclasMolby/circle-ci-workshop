FROM openjdk:8
COPY . .
ENTRYPOINT ["ls"]
