FROM eclipse-temurin:20-jdk AS build
COPY . /app
WORKDIR /app
RUN ./gradlew bootJar
RUN mv -f build/libs/*.jar app.jar

FROM eclipse-temurin:20-jre
COPY --from=build /app/app.jar .
USER runtime
ENTRYPOINT [ "java", "-jar", "app.jar" ]
