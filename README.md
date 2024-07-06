<h1>Parallel Test Execution with Selenium and TestNG</h1>
This repository provides a reference implementation for running parallel tests using Selenium WebDriver and TestNG. It is intended for those who are new to parallel test execution and want a simple example to get started.

## Table of Contents
- [Introduction](#introduction)
- [Prerequisites](#prerequisites)
- [Project Structure](#project-structure)
- [Setup Instructions](#setup-instructions)
- [Running the Tests](#running-the-tests)
- [Customization](#customization)
- [Contributing](#contributing)

## Introduction
Parallel test execution allows you to run multiple tests simultaneously, reducing the overall time required to complete your test suite. This repository demonstrates how to configure and execute parallel tests using Selenium WebDriver and TestNG.

## Prerequisites
Before you begin, ensure you have the following installed:
- Java Development Kit (JDK) 8 or higher
- Apache Maven
- An IDE such as IntelliJ IDEA or Eclipse

## Project Structure
The repository is organized as follows:
```
.
├── src
│ ├── main
| | ├── DataProvider
| | | └── Data.java
| | ├── Page
| | | └── BaseTest.java
│ └── test
│ | ├── java
│ │ | ├── Parallel
│ │ │ | ├── ParallelClassA.java
│ │ │ | ├── ParallelClassB.java
│ │ │ | ├── ...
│ │ │ | ├── ...
│ │ │ | └── ParallelClassJ.java
│ └── resources
│ └── testng.xml
├── pom.xml
└── README.md
```

- `ParallelClassA.java` , `ParallelClassB.java` , etc. : Example test classes.
- `testng.xml`: Configuration file for TestNG, specifying parallel execution settings.

## Setup Instructions

1. **Clone the Repository**:
   ```sh
   git clone https://github.com/Animesh9/ParallelTestExecutionTutorial.git
   cd parallel-tests-selenium-testng

2. **Install Dependencies:**

   Ensure you have Maven installed and run the following command:
   ```sh
   mvn clean install

## Running the Tests

The `testng.xml` file is configured to run tests in parallel. You can modify the `parallel` and `thread-count` attributes to control the parallel execution behavior.

## Customization
**Modifying Parallel Execution:**

Edit the testng.xml file to adjust parallel execution settings:
```
<suite name="Parallel Test Suite" parallel="classes" thread-count="4">
    <test name="Test1">
        <classes>
            <class name="com.example.tests.TestClass1"/>
            <class name="com.example.tests.TestClass2"/>
        </classes>
    </test>
</suite>
```
**Adding New Tests:**

Create new test classes in the `src/test/java/Parallel` directory and update the `testng.xml` file accordingly.

## Contributing

Contributions are welcome! Please fork the repository and create a pull request with your changes. Ensure your code adheres to the existing style and include appropriate tests.
