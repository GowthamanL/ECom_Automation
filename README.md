# E-Commerce Automation
This project is a demonstration of automated testing for an e-commerce website, with a primary focus on two key test cases: login and place order. Automated testing is a critical aspect of software development that ensures the functionality and reliability of your e-commerce platform
## Table of Contents:
- Prerequisites
- Usage
- Test Cases
        - Login
        - Place Order

## Pre-requisites:
Before you get started with this project, make sure you have the following prerequisites:

- Java
- Selenium
- Webdriver for your preferred web browser (e.g., Chrome, Firefox)
An e-commerce website to test : https://demo.nopcommerce.com/

## Usage:
   1. Clone or download the project from github.
   2. Open the project using Integrated Development Environment (IDE) like Eclipse, IntelliJ, etc.,
   3. Set up the input data by alternating "config.properties" file in project directory.
   4. Configure the webdriver to match your browser and system (e.g., ChromeDriver for Chrome).
   5. Find the test cases  folder in project directory and run the test cases  
        
## Test Cases:
# Login
The login test case verifies the functionality of the login process on the e-commerce website. It includes steps to:

- Open the website.
- Read credentials from the property file. (e.g.,config.properties)
- Enter valid credentials.
- Verify successful login.
- Place Order

# Place Order
- Log in (if not already logged in).
- Read product name and shipping address from the property file.
- Browse and select products.
- Add products to the shopping cart.
- Proceed to checkout.
- Enter shipping information.
- Confirm order
- Get Order Number
