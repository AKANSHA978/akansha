#  SauceTestDemo - Selenium TestNG Automation Framework

This is a lightweight, robust, and scalable **Selenium automation framework** built with:

-  TestNG for test orchestration  
-  Selenium WebDriver for browser automation  
-  WebDriverManager for automatic driver management  
-  ExtentReports for beautiful test reporting  
-  Log4j for detailed test execution logs  

The project automates functional flows for the [SauceDemo](https://www.saucedemo.com/) sample web app.
# Akansha's Automation Framework Collection 🚀

This repository is a collection of various automation testing frameworks and sample projects built using different tools and technologies. It is intended for learning, experimenting, and demonstrating end-to-end automation capabilities across multiple platforms.

---

## 📁 Project Structure

.
├── automation/ # General Java TestNG-based automation
├── cucumber/ # Cucumber BDD framework (feature files & step defs)
├── myappiumdemo/ # Appium mobile automation demo
├── playwright-tests/ # Playwright framework for UI testing
├── RestAssured/rest-demo/ # API testing using Rest Assured
├── src/test/ # Common test resources
├── test-output/ # TestNG output folder
├── target/ # Maven build folder
├── pom.xml # Maven dependencies
├── testng.xml # TestNG suite configuration
└── README.md # Project documentation

markdown
Copy
Edit

---

## 🔧 Tools & Technologies

- **Java**
- **Maven**
- **TestNG**
- **Cucumber (BDD)**
- **Rest Assured (API Testing)**
- **Appium (Mobile Automation)**
- **Playwright (Web Automation)**
- **Gherkin**
- **VS Code / Eclipse**
---

## 📁 Project Structure

saucetestdemo/
│
├── src/
│ ├── main/java/
│ └── test/java/
│ ├── base/ # BaseTest (WebDriver setup/teardown)
│ ├── tests/ # All Test Classes (Login, Cart, etc.)
│ └── utils/ # LoggerUtil, ExtentReportManager
│
├── src/test/resources/
│ └── log4j.xml # Log4j config
│
├── pom.xml # Maven dependencies
├── testng.xml # TestNG suite
└── README.md # Project documentation

---

## ✅ Features

-  Runs tests in **Chrome Incognito Mode**
-  Generates dynamic **ExtentReports** after every run
-  Logs test steps using **Log4j**
-  Fully Maven-based
-  Scalable and easy to extend with new tests

---

## 🚀 Getting Started

### 🛠 Prerequisites

- Java 8+
- Maven
- Chrome Browser
- Git

---

### 📥 Clone the Repository

```bash
git clone https://github.com/AKANSHA978/akansha.git
cd saucetestdemo
🧪 Run the Tests
Via TestNG XML (from IDE like Eclipse or IntelliJ):

mathematica
Copy
Edit
Right-click testng.xml → Run As → TestNG Suite
Via Maven CLI:

bash
Copy
Edit
mvn clean test
🧾 Test Scenarios Implemented
Test Class	Description
LoginTest	Validates login on SauceDemo
AddToCartTest	Adds product to cart & verifies item
CheckoutTest	(Planned) Proceeds to checkout flow

📊 Reports
After test execution, view reports here:


test-output/ExtentReport.html
It includes:

Pass/Fail status

Step-wise logs

Screenshots (if enabled)

🛠 Future Enhancements
⏱ Add waits using Selenium ExpectedConditions

🔄 Parameterize tests via testng.xml

🔁 Add CI integration (GitHub Actions)

🌍 Multi-browser support

🤝 Author
Akansha Bhardwaj
📧 Feel free to connect or contribute via GitHub
🔗 github.com/AKANSHA978
