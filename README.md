# Spring Boot with MyBatis Demo

This is a sample Spring Boot project that demonstrates how to integrate MyBatis for data access in a Spring Boot
application.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
    - [1. Clone the Repository](#1-clone-the-repository)
    - [2. Configure the Database](#2-configure-the-database)
    - [3. Build and Run](#3-build-and-run)
- [API Endpoints](#api-endpoints)
- [Configuration](#configuration)
- [Contributing](#contributing)

## Prerequisites

Before you get started with this project, make sure you have the following prerequisites:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html) installed
- [Maven](https://maven.apache.org/download.cgi) installed
- A H2, MySQL or PostgreSQL database server
- An integrated development environment (IDE) like [IntelliJ IDEA](https://www.jetbrains.com/idea/)
  or [Eclipse](https://www.eclipse.org/ide/)

## Project Structure

The project follows a standard Spring Boot project structure:

```
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── loveable/
│   │           └── demo/
│   │               ├── controller/  # Controller classes
│   │               ├── mapper/  # MyBatis Mapper interfaces
│   │               ├── model/       # Entity classes
│   │               ├── service/     # Service classes
│   │               └── DemoApplication.java  # Main application class
│   │
│   └── resources/
│       ├── application.properties  # Database and Spring configuration
│       └── static/                 # Static resources (e.g., HTML, CSS)
│
└── test/
    └── java/
        └── com/
            └── loveable/
                └── demo/
                    └── controller/
                        └── EmployeeControllerTest.java  # Test cases

```

## Getting Started

Follow these steps to set up and run the project on your local machine:

### 1. Clone the Repository

Clone this repository to your local machine using Git:

```shell
git clone https://github.com/Mensaloveable/Spring-Boot-MyBatis-Demo
cd spring-boot-mybatis-demo
```

### 2. Configure the Database

Create a H2, MySQL or PostgreSQL database.
Update the database connection details in src/main/resources/application.properties.

### 3. Build and Run

Build the project using Maven:

```shell
mvn clean install
```

Run the application:

```shell
mvn spring-boot:run
```

The Spring Boot application will start,
and you can access it at http://localhost:8080.
You can also test the API endpoints (see API Endpoints).

## API Endpoints

- **GET /employees**: Retrieve all employees.
- **GET /employees/{id}**: Retrieve an employee by ID.
- **POST /employees**: Create a new employee.
- **PUT /employees**: Update an employee.
- **DELETE /employees/{id}**: Delete an employee.

## Configuration

The project's configuration is defined in the `application.properties` file. You can update this file to modify the
database connection, server port, and other application properties.

## Contributing

Contributions to this project are welcome. To contribute, please follow these steps:

1. **Fork the repository.**

2. **Create a new branch for your feature or bug fix.**

3. **Make your changes and commit them.**

4. **Push your changes to your fork.**

5. **Submit a pull request to the main repository.**

