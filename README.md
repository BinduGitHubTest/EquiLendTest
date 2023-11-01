PROJECT TITLE: EquiLendTest

PROJECT OBJECTIVE:

Using java; verifying the scenarios for a test page that have been requested

It has been assumed that User Story and its acceptance criteria are as below.

User Story: As a user, I want to check the Remove functionality on Dynamic controls page and Red button functionality on challenging page works as expected

Acceptance Criteria:

•  Verify Remove functionality works as expected.

•  Verify the given buttons functionality works as expected

--------------------------------------------------------------------------------------------------------
BUILD and RUN:

This is maven project and tests are written in Cucumber-BDD, and
Feature files are written in Gherkin language to make it easy to understand for non-technical people.
It is also created by using basic Page Object Model design pattern, so it can be easily modified and improved if needed.

Driver class is designed as Singleton, and configuration.properties file is added to store the commonly used data like url, browser.
ConfigurationReader takes the data from configuration.properties and passes through to classes when needed.

Page classes are created to locate their own elements for each page separately as per POM.

Step definition classes have the methods to execute feature files.

Utility classes are created to store reusable codes.

Hooks class is created to implement the codes which run before and after all the tests and this is where TakeScreenShot is invoked for each failure.

Below are the dependencies are being used for this project:

•  Selenium-java

•  Cucumber-junit

•  Cucumber-java

Pre-Requisites:
Ensure that the chromeDriver version compatible with your local Chrome browser version is downloaded and place in '/use/local/bin' folder
