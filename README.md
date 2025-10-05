# Spring Boot Microservices – Docker Compose

A minimal Spring Boot microservices project demonstrating inter-service communication over REST, containerized with Docker and orchestrated using Docker Compose.

## Overview
This demo consists of two independent services:
- **user-service (port 8081)** – Provides user data by ID.  
- **greeting-service (port 8082)** – Consumes user-service API to generate personalized greetings.

## Tech Stack
- Java 17  
- Spring Boot 3  
- REST API (Spring Web)  
- Maven  
- Docker & Docker Compose

## Run Locally
```
mvn -q -DskipTests package
docker-compose up --build
```

**Endpoints**
- User Service → http://localhost:8081/users/1  
- Greeting Service → http://localhost:8082/greet/1

## Author
Yael Zadok
