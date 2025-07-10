# Evernote UI Automation Framework

This project is a scalable and maintainable end-to-end UI test framework for the [Evernote](https://evernote.com/) web application. 

---

## Technologies Used

- **Java 21**
- **JUnit 5**
- **Selenide**
- **Gradle** 
- **WebDriverManager** 
- **Allure**
- **AssertJ** 
- **Jackson**
- **SLF4J + Logback** 
---

## 🧱 Project Structure

## ✅ Automated Test Scenarios

1. ❌ Unsuccessful login using invalid email/password
2. ✅ Successful login with valid credentials
3. 📝 Create a note → logout
4. 🔁 Login again → open the created note

---

## ⚙️ How to Run Tests

Make sure you have:
- Java 21
- Google Chrome browser

Then in the terminal:

```bash
./gradlew clean test