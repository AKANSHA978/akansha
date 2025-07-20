# 🚀 Akansha's Automation Framework Collection

Welcome to my all-in-one automation repository! This repo contains various automation frameworks and practice scripts developed by me, **Akansha Bhardwaj**, to showcase my expertise in automation testing using tools like **Selenium**, **TestNG**, **RestAssured**, **Cucumber**, **Playwright**, and **Appium**.

---

## 📁 Folder Structure

| Folder/File               | Description |
|--------------------------|-------------|
| `practice/`              | Java-based Selenium TestNG practice scripts for various websites (IRCTC, PolicyBazaar, PrestaShop, etc.) |
| `Page object model project/` | Page Object Model (POM) framework with structured test cases |
| `RestAssured/rest-demo/` | API testing with RestAssured |
| `cucumber/cucumber/`     | BDD framework using Cucumber |
| `myappiumdemo/`          | Appium mobile automation demo |
| `playwright-tests/`      | Playwright automation examples |
| `target/`, `test-output/`| Build/test reports (can be ignored in commits) |
| `pom.xml`                | Maven configuration file |
| `testng.xml`             | TestNG suite file |

---

## 🛠️ Tools & Technologies Used

- **Language**: Java
- **Build Tool**: Maven
- **Test Framework**: TestNG, JUnit, Cucumber
- **API Testing**: RestAssured
- **Browser Automation**: Selenium WebDriver, Playwright
- **Mobile Automation**: Appium
- **CI/CD (optional)**: GitHub Actions / Jenkins
- **Reporting**: ExtentReports, Allure (can be integrated)

---

## 🧪 Example Test Scenarios

- End-to-End Checkout Flow for PrestaShop
- Flight Booking & Filters (IRCTC-like)
- Login/Logout Validations
- Non-Select Dropdowns, Calendar Handling
- API Requests with Assertions (GET/POST)
- Mobile App Login Test (Appium)
- Cucumber BDD Login Features

---

## ✅ How to Run This Project

```bash
git clone https://github.com/AKANSHA978/akansha.git
cd akansha
mvn clean test

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
