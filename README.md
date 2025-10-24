# tp2_rallye

Minimal Spring Boot project scaffold created by assistant.

Requirements
- Java 17+ installed and available on PATH
- Maven installed and available on PATH

Build & run (Windows PowerShell)

```powershell
# build (skip tests)
mvn -DskipTests package

# run with Spring Boot plugin
mvn spring-boot:run

# or run the produced jar
java -jar target\tp2-rallye-0.0.1-SNAPSHOT.jar
```

Open http://localhost:8080/ to see a test response from the sample controller.

Files added
- `pom.xml` - Maven build for Spring Boot 3.x (starter-web)
- `src/main/java/com/example/demo/DemoApplication.java` - main class
- `src/main/java/com/example/demo/HelloController.java` - sample REST controller
- `src/main/resources/application.properties` - config
- `.gitignore` - common Java/Maven ignores

Next steps
- If you want a different package/artifactId or to use Gradle, tell me and I can adjust the scaffold.
