# Wipro Final Capstone Project - Selenium Automation Framework

## Overview

This project is a Selenium Automation Framework developed using Java, Selenium WebDriver, TestNG, Maven, Jenkins, and the Page Object Model (POM) design pattern.

The framework automates various web application functionalities and demonstrates reusable test automation architecture, reporting, logging, and CI/CD integration.

---

## Technologies Used

- Java
- Selenium WebDriver
- TestNG
- Maven
- WebDriverManager
- Log4j2
- Extent Reports
- Apache POI (Excel Handling)
- Jenkins
- Git & GitHub

---

## Framework Design

The framework follows the Page Object Model (POM) design pattern for better maintainability, scalability, and reusability.

---

## Project Structure

```text
src/test/java

├── listeners
│   └── TestListener.java
│
├── pages
│   ├── GUIElementsPage.java
│   ├── ActionsPage.java
│   └── AlertPage.java
│
├── tests
│   └── GUIElementsTest.java
│
├── utils
│   ├── DriverFactory.java
│   ├── ExcelUtils.java
│   ├── ExtentManager.java
│   └── ScreenshotUtil.java
│
└── resources
    ├── log4j2.xml
    └── TestData.xlsx
```

---

## Automated Scenarios

### GUI Elements Automation

The framework automates multiple web interactions including:

- Title Validation
- Form Filling
- Mouse Hover
- Double Click
- Drag and Drop
- Slider Handling
- Dynamic Button Handling
- Single File Upload
- Multiple File Upload
- Static Table Reading
- Dynamic Table Reading
- Pagination Handling
- Alert Handling
- Window Handling
- Broken Link Validation
- Shadow DOM Handling
- Wikipedia Search
- SVG Elements Handling
- Visitor Counter Validation
- Mobile Labels Validation
- Laptop Links Validation
- Hidden Elements Handling
- AJAX Elements Handling
- Download File Validation
- Section Forms Handling
- Screenshot Capture

---

## Framework Features

- Page Object Model (POM)
- Reusable Page Classes
- Driver Factory Design
- Excel Data Handling
- Screenshot Capture Utility
- Extent Reports
- Log4j Logging
- TestNG Execution
- Jenkins Integration
- GitHub Version Control

---

## Reporting

### Extent Reports

Reports are generated automatically after execution.

```text
Reports/
└── AutomationReport.html
```

Report includes:

- Execution Summary
- Pass / Fail Status
- Test Details
- Execution Time
- Screenshots (if captured)

---

## Logging

Framework uses Log4j2 for logging.

```text
Logs/
└── Automation.log
```

Logs help track execution flow and debugging information.

---

## Test Execution

Run the complete suite using:

```bash
mvn test
```

Or

Run:

```text
testng.xml
```

as TestNG Suite.

---

## Jenkins CI/CD Integration

The framework is integrated with Jenkins.

Jenkins performs the following:

- Pull latest code from GitHub
- Execute Maven Build
- Run TestNG Test Suite
- Generate Extent Reports
- Archive Test Results

### Jenkins Workflow

```text
GitHub Repository
        ↓
Jenkins Job
        ↓
Maven Build
        ↓
TestNG Execution
        ↓
Extent Report Generation
        ↓
Build Result Published
```

---

## Project Outcome

- Automated Test Execution
- Reusable Framework Design
- Reporting and Logging
- Continuous Integration using Jenkins
- GitHub Integration

---

## Author

Prachi Tirole

Wipro SDET Automation Testing Capstone Project
