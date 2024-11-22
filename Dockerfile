FROM openjdk:11

WORKDIR /app

COPY HelloWorld.class /app

CMD ["java", "HelloWorld"]
