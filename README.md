# CI/CD Practice

## Description
This project demonstrates the implementation of Continuous Integration (CI) using Jenkins for a Web Automation Java application. Follow the steps below to set up and run the application locally.

## About Web Automation Project
This Selenium-Java-TestNG project automates the testing of the https://www.saucedemo.com/ web application, covering key scenarios and adhering to best practices.
### Dependencies:
- Selenium WebDriver
- TestNG
- WebDriverManager 
- Allure Report
### Browser
- Chrome
### Tests
**1. Test 1:** A purchasing process is automated.<br>
**2. Test 2:** Correct operation is tested when adding or removing products.<br>

## Environment Variable Included in a project
Those variables are useful for logging into the project page, whose default values are:
- **USERNAME :** *standard_user*
- **PASSWORD :** *secret_sauce*

## Requirements to Jenkins
1. Maven:
    - Install Maven on the Jenkins server.
    - Configure Maven in Jenkins Global Tool Configuration.  
2. Allure:
    - Install the Allure command-line tools on the Jenkins server.
## Configure new Pipeline project
In the pipeline configuration:

1. Choose the definition of the Pipeline as "Pipeline script from SCM."
2. Select SCM (Source Code Management) as Git, and provide the repository URL:<br>
   **Repository URL:** https://github.com/mntoala/jenkins_practice
3. In the "Branch Specifier" section, ensure it is set to:<br>
  **Branch Specifier:** */main
4. Specify the Script Path:<br>
  **Script Path:** jenkins/Jenkinsfile
5. Save and run.
## View Allure Reports
After the pipeline completion, access the Allure reports generated in the Jenkins workspace.<br>
Follow these steps diligently to streamline the Jenkins pipeline setup for a successful execution of the CI/CD process.<br>
Feel free to enhance or modify the project according to your needs.<br>
Happy testing!
## Contact
Name: Marina Toala<br>
Email: nicotoala@outlook.com<br>









