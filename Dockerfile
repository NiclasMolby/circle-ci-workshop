FROM openjdk:8
COPY gildedrose-*.jar home/
ENTRYPOINT ["ls"]
