Spring-boot-CRUD-with-Mysql
A Spring Boot 3 project demonstrating CRUD operations and basic logic processing using MySQL as a persistent database and Spring Data JPA. It includes endpoints for managing multiple entities like `User`, `Employee`, `Car`, `Book`, `BestSeller`, and simple algorithm logic like age checking, leap year verification, and temperature status.

Features
-  Full CRUD operations using Spring Data JPA
-  MySQL database integration
-  Simple algorithmic logic (age group, leap year, temperature level)
-  Swagger/OpenAPI documentation
-  Organized into MVC: Model, Repository, Service, Controller
-  Input validation via Jakarta Bean Validation

 Technologies Used

| Technology             | Purpose                                  |
|------------------------|------------------------------------------|
| Java 17                | Programming Language                     |
| Spring Boot 3.4.5      | Application Framework                    |
| Spring Web             | REST API creation                        |
| Spring Data JPA        | ORM and database access                  |
| MySQL                  | Relational Database                      |
| Spring Validation      | Input validation                         |
| SpringDoc OpenAPI      | API documentation with Swagger UI        |
| Lombok                 | Reduces boilerplate (getters/setters)    |
| Maven                  | Project and dependency management        |

 Entities Managed

The app handles various domain entities via REST:

- `User`
- `Employee`
- `Department`
- `Book`
- `BestSeller`
- `Car`
- And logic models:
  - `AgeCheckerModel`
  - `LeapYearModel`
  - `TemperatureModel`

Sample REST Endpoints

| HTTP Method | Endpoint                        | Description                          |
|-------------|----------------------------------|--------------------------------------|
| POST        | `/api/bestseller/postsales`      | Create a BestSeller record           |
| GET         | `/api/bestseller/sales/{id}`     | Retrieve BestSeller by ID            |
| POST        | `/api/all/ageCategory`           | Age category logic                   |
| POST        | `/api/all/yearChecking`          | Leap year logic                      |
| POST        | `/api/all/temperature`           | Temperature status logic             |

> There are 12 controllers and 12 models in total – each designed to handle different business logic or CRUD functionalities.

Swagger/OpenAPI

API documentation is automatically generated and can be accessed at:

- Swagger UI: `http://localhost:8080/swagger-ui.html`
- OpenAPI Docs: `http://localhost:8080/v3/api-docs`

Database Configuration

properties
 MySQL Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/john
spring.datasource.username=root
spring.datasource.password=

Hibernate & JPA
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

Run Locally
Prerequisites
    JDK 17+
    MySQL Server
    Maven

Steps
git clone https://github.com/Catus07/DataBaseMysql.git
cd DataBaseMysql
mvn spring-boot:run
Visit http://localhost:8080/swagger-ui.html to explore the APIs.

 Project Structure
├── controller/      # REST endpoints
├── service/         # Business logic
├── model/           # Entity + logic models
├── repo/            # Spring Data JPA repositories
├── config/          # Swagger configuration
├── application.properties
└── pom.xml

    You can add test cases under src/test/java/...

License
This project is free to use under the MIT License.
    Created by Revocatus Joseph Nduki — Passionate about Java & backend development 
