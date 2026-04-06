# Selenium Java Automation Framework

This project is a basic QA automation framework built using **Java**, **Selenium WebDriver**, **TestNG**, and **Maven**.

## Objective
The purpose of this repository is to demonstrate hands-on experience in:

- UI automation testing
- Selenium WebDriver implementation
- Page Object Model (POM)
- Test structure and maintainability
- Functional validation of web application flows

## Tech Stack
- Java
- Selenium WebDriver
- TestNG
- Maven
- WebDriverManager

## Test Scenarios Covered
This project automates the following test cases using the Sauce Demo application:

1. **Successful Login**
    - Validates that a standard user can log in successfully

2. **Invalid Login**
    - Validates that an error message is displayed for invalid credentials

3. **Add Product to Cart**
    - Validates that a logged-in user can add a product to the shopping cart

## Project Structure
```bash
src
├── main
│   └── java
│       ├── pages
│       │   ├── LoginPage.java
│       │   └── InventoryPage.java
│       └── utils
│           └── DriverFactory.java
└── test
    └── java
        ├── tests
        │   ├── LoginTest.java
        │   ├── InvalidLoginTest.java
        │   └── AddToCartTest.java
        └── utils
            └── BaseTest.java