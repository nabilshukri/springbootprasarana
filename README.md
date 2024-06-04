# Spring Boot Assessment

## Overview
This project is a web application developed using Spring Boot, Thymeleaf, and Spring Security. It includes features for user authentication and authorization, with role-based access control.

## Features
- User sign-up and login
- Role-based access to pages (user and admin roles)
- Thymeleaf templates for UI
- Database integration (PostgreSQL)

## Prerequisites
- Java 17
- Gradle
- Git
- PostgreSQL
- IDE (e.g., IntelliJ IDEA)

## Setup Instructions

1. **Clone the repository:**
    ```sh
    git clone https://github.com/nabilshukri/springbootprasarana.git
    cd springbootprasarana
    ```

2. **Configure the database:**
   - Ensure PostgreSQL is installed and running.
   - Create a database named `spring_user`.
   - Update `spring.datasource.username` and `spring.datasource.password` in `application.properties` with your PostgreSQL credentials.

3. **Open the project in IntelliJ IDEA:**
   - Open IntelliJ IDEA.
   - Select `Open` and navigate to the `springbootprasarana` directory.
   - Open the project.

4. **Run the application:**
   - In IntelliJ IDEA, navigate to the `SpringbootprasaranaApplication` class.
   - Right-click the class and select `Run 'SpringbootprasaranaApplication.main()'`.

5. **Access the application:**
    Open your browser and navigate to `http://localhost:8080`

## Documentation
### Authentication and Authorization
- Spring Security is used for handling authentication and authorization.
- Users can sign up and log in.
- Access to specific pages is restricted based on roles.

### Thymeleaf Templates
- Templates are used for login, registration, and restricted pages.
- Dynamic content is displayed using Thymeleaf.

### Database Integration
- PostgreSQL is used to store user information.
- User authentication is performed based on database records.

## Implementation Choices
1. **Spring Security Configuration:**
    - Utilizes `SecurityFilterChain` to define security rules.
    - CSRF protection is disabled for simplicity.
    - Role-based access control is implemented.
    - Custom `AuthenticationSuccessHandler` redirects users post-login based on roles.

2. **Password Encoding:**
    - `BCryptPasswordEncoder` is used to ensure secure password storage.

3. **User Details Service:**
    - `MyUserDetailService` is implemented to load user-specific data during authentication.

4. **Thymeleaf:**
    - Chosen for seamless integration with Spring Boot and ease of creating dynamic views.

## Assumptions
- The application is configured with default settings for simplicity.
- PostgreSQL is used for persistence, assuming familiarity with setting up and configuring the database.
- The development environment uses IntelliJ IDEA for running the application.
