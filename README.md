# Whale is busy!

Whale is busy is a repo with my notes to automatize the Docker containers with a execute .jar insider them. The process is built with one of my repositories [gilded rose](https://github.com/dEzequiel/gilded-rose-java).

Also I used [Maven](https://maven.apache.org) for compile and package the Java source code.

The Docker file look like this. Quickly, we using Java 11 version to execute the program, copying the compiled java jar file into container dir. Finally, we automatice the commands that's going to be execute, just executing the jar file.

```
FROM openjdk:11.0-jre-slim-buster

LABEL "edu.elsmancs.gildedrose"="Kata Gilded Rose"
LABEL version="1.0"
LABEL description="Kata Gilded Rose en Java"
LABEL maintainer="erosarosario@cifpfbmoll.eu"

WORKDIR $HOME/app

COPY gildedrose/target/gildedrose-1.0-SNAPSHOT.jar ./app/gildedrose.jar

CMD ["java", "-jar", "/app/gildedrose.jar"]
```

Afther this, build the image based in Dockerfile.

`docker build -t ollivanders-shop .`

We created the image locally, so we can create a container based in our local image.

`docker run -it --name ollivanders ollivanders-shop`