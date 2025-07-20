## 🚀 Selenium Automation - ITestListener-integration
A automation framework is more than just passing tests — it's about knowing what happened, when, and why. As I continue to enhance my Selenium automation skills, in this hands-on exercise, I implemented TestNG’s ITestListener interface in my Selenium + Java framework. It helps me track when each test starts, passes, fails, or gets skipped. From test start and success to failure and skipped scenarios — everything is captured and logged to a central log file.

---

## 🛠️ Tools and Technologies Used

| Category             | Tools / Technologies                             |
|----------------------|--------------------------------------------------|
| **Programming**      | Java                                             |
| **Build Tool**       | Maven                                            |
| **Testing Framework**| TestNG                                           |
| **Automation Tool**  | Selenium WebDriver                               |
| **Logging Framework**| Log4j2                                           |
| **Design Pattern**   | Page Object Model (POM)                          |
| **Dependency Manager** | Maven `pom.xml`                                |
| **IDE**              | Eclipse                                          |
| **Version Control**  | Git & GitHub                                     |
| **Configuration**    | `QA-config.properties`, `log4j2.properties`      |

---

### 📂 Here's what it now tracks automatically:
✅ When each test starts and ends  
✅ Success, failure, or skip status  
✅ Detailed exception logs for failures and skips  
✅ Suite-level start and finish logs  

---

### Project Structure  
  <img width="483" alt="" src="https://github.com/user-attachments/assets/82f09471-39da-4d14-b7cb-9c1522d33906" />

---

### 🔍 What I Did:  
1. **Crafted `ReportListeners.java`**  
   Implemented the `ITestListener` interface to manage core lifecycle methods:
   - `onTestStart`
   - `onTestSuccess`
   - `onTestFailure` (triggers screenshot capture)
   - `onTestSkipped`
<img width="1408" alt="02_ReportListener_class" src="https://github.com/user-attachments/assets/ae350478-be98-4c36-9077-48dd882acff1" />

2. **Integrated listener in `testng.xml`**  
   Registered the `ReportListeners` class to activate listener behavior during test execution:
    <img width="1393" height="317" alt="" src="https://github.com/user-attachments/assets/2cb9f987-370f-4754-b834-eed2d7b8a514" />  

3. **Utilized ScreenshotUtil.java**  
  Developed a reusable utility for automated screenshot capture, especially for failed test cases. Captured images are saved with timestamped names for easy identification.
<img width="1408" alt="03_SceenshotUtil" src="https://github.com/user-attachments/assets/dd22eda2-e400-4db2-bdd7-59d645867b6d" />

4. **Enabled Logging with automation.log**
  All test events and exceptions are logged using Log4j2:
  - Output visible in console during runtime
    <img width="1034" height="1775" alt="05_ConsoleLog" src="https://github.com/user-attachments/assets/16232081-d1f3-4378-9b6b-5cd50bfe8c76" />  
    
  - Logs persisted in automation.log for post-execution analysis
    <img width="1874" height="935" alt="06_Automation_log" src="https://github.com/user-attachments/assets/8bd93c0d-8144-467f-a704-f553130f818f" />  

---

### Steps To Run:

1. Create and Clone the project to selenium-automation-ITestListener-integration folder
```
git clone https://github.com/amulsinfal/selenium-automation-ITestListener-integration.git
```

2. Go to the folder selenium-automation-ITestListener-integration containing the testng.xml file.
```
cd selenium-automation-ITestListener-integration
```

3. Open command prompt from this location and Run maven command in command prompt.
```
mvn test
```

  <img width="1080" height="1872" alt="" src="https://github.com/user-attachments/assets/161f4120-4f07-41e9-9be3-c37d2a235cea" />


---

### 💡 This setup provides:  
✅ Better traceability  
✅ Simplified debugging  
✅ Improved reporting  

---
### Conclusion

Integrating ITestListener added real-time logging, better test traceability, and screenshot capture , making my Selenium framework more robust, maintainable.

