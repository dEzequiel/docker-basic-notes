FROM openjdk:11.0-jre-slim-buster

LABEL "edu.elsmancs.gildedrose"="Kata Gilded Rose"
LABEL version="1.0"
LABEL description="Kata Gilded Rose en Java"
LABEL maintainer="erosarosario@cifpfbmoll.eu"

WORKDIR $HOME/app

COPY gildedrose/target/gildedrose-1.0-SNAPSHOT.jar ./app/gildedrose-1.0-SNAPSHOT.jar

CMD ["java", "-jar", "./app/gildedrose-1.0-SNAPSHOT.jar"]