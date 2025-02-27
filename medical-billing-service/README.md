# Medical Billing Service

## Overview
The Medical Billing Service is a Spring Boot microservice designed for online medical billing specifically tailored for pharmacy clients. This application provides functionalities such as bill creation, retrieval, and printing, along with additional features relevant to pharmacy operations.

## Features
- Create and manage billing records for pharmacy clients.
- Retrieve billing information based on patient ID.
- Print bills in a user-friendly format.
- H2 database support for easy setup and testing.

## Project Structure
```
medical-billing-service
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── medicalbilling
│   │   │               ├── MedicalBillingServiceApplication.java
│   │   │               ├── controller
│   │   │               │   └── BillingController.java
│   │   │               ├── model
│   │   │               │   └── Bill.java
│   │   │               ├── repository
│   │   │               │   └── BillRepository.java
│   │   │               └── service
│   │   │                   └── BillingService.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── data.sql
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── medicalbilling
│                       └── MedicalBillingServiceApplicationTests.java
├── .gitignore
├── mvnw
├── mvnw.cmd
└── pom.xml
```

## Getting Started

### Prerequisites
- Java 11 or higher
- Maven

### Setup Instructions
1. Clone the repository:
   ```
   git clone <repository-url>
   ```
2. Navigate to the project directory:
   ```
   cd medical-billing-service
   ```
3. Run the application using Maven:
   ```
   ./mvnw spring-boot:run
   ```
   or for Windows:
   ```
   mvnw.cmd spring-boot:run
   ```

### Accessing the Application
Once the application is running, you can access the API endpoints at:
```
http://localhost:8080/api/bills
```

### API Endpoints
- **POST /api/bills**: Create a new bill.
- **GET /api/bills/{id}**: Retrieve a bill by ID.
- **GET /api/bills/print/{id}**: Print a bill by ID.

## License
This project is licensed under the MIT License. See the LICENSE file for details.