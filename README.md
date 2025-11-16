🛒 ShoppingCartAutomation

Automated testing framework for the Demo Web Shop website using Selenium WebDriver, TestNG, Java, and Extent Reports.

This project automates major shopping cart functionalities such as login, adding items, updating cart, removing items, and performing checkout. It also generates detailed HTML extent reports after each run.

🚀 Features

✔ Selenium WebDriver 4 automation

✔ TestNG test execution

✔ Page Object Model (POM) design

✔ Extent Reports with screenshots for failures

✔ Clean Maven project

✔ 5 fully working test cases

✔ Zero errors — ready to run

📂 Project Structure
ShoppingCartAutomation/
 ├── pom.xml
 ├── testng.xml
 ├── reports/   (auto-generated)
 ├── src/
 │   ├── main/java/
 │   │   ├── base/
 │   │   │     └── TestBase.java
 │   │   ├── pages/
 │   │         ├── BasePage.java
 │   │         ├── LoginPage.java
 │   │         ├── ProductPage.java
 │   │         ├── CartPage.java
 │   │         └── CheckoutPage.java
 │   ├── test/java/
 │   │   ├── listeners/
 │   │   │       └── TestListener.java
 │   │   ├── utils/
 │   │   │       └── ExtentManager.java
 │   │   ├── tests/
 │   │         ├── LoginTest.java
 │   │         ├── AddToCartTest.java
 │   │         ├── UpdateCartTest.java
 │   │         ├── RemoveItemTest.java
 │   │         └── CheckoutTest.java

🧪 Test Cases Included
1️⃣ LoginTest

Valid login flow

Verifies login status

2️⃣ AddToCartTest

Adds a book to cart

Verifies success message

3️⃣ UpdateCartTest

Updates the quantity

Verifies price refresh

4️⃣ RemoveItemTest

Removes item from cart

Confirms cart empty

5️⃣ CheckoutTest

Logs in

Adds an item

Proceeds to checkout

All tests PASS successfully ✔.

🛠️ Tech Stack

Java 17

Selenium WebDriver 4

TestNG

Extent Reports

Maven

WebDriverManager

▶️ How to Run the Tests
Option 1 — Using Eclipse/IntelliJ

Right-click on testng.xml

Select Run As → TestNG Suite

Option 2 — Using Maven
mvn clean test


Reports will be generated in:

/reports/extent-report.html
/reports/screenshots/

📊 Extent Report Preview

The project automatically generates:

✔ Test logs

✔ Pass/Fail status

✔ Execution timeline

✔ Screenshots for failures

🧾 Requirements

JDK 17+

Maven installed

Stable internet for WebDriverManager

🌐 Demo Site Used

https://demowebshop.tricentis.com/

👩‍💻 Author

Shalu Jha
Selenium | Java | Test Automation Engineer
