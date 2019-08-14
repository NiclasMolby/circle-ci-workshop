FROM openjdk:8
COPY *.jar home/
ENTRYPOINT ["ls"]
