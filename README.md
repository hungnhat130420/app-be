# app-be
HOW TO RUN APPLICATION:

1. BUILD JAR FILE:
- RUN: mvn clean package -DskipTests

2. Build images app-be:
- RUN: docker build -t app .

3. RUN DOCKER-COMPOSE:
- RUN: docker-compose up
