package com.automationPractice.base;

import com.automationPractice.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseActions {
    WebDriver driver;

    public BaseActions(WebDriver driver) {
        this.driver = driver;
    }

    protected void clickOn(WebElement element) {
        try {
            element.click();
            String message = "User clicks On Element: " + element;
            System.out.println(message);
        } catch (Exception e) {
            System.out.println("Exception on clicking element" + element);
            System.out.println(e.getMessage());
        }
    }

    protected void waitUntilUrlContains(String url) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.urlContains(url));
        String message = "wait until URL: " + url + " is visible";
        System.out.println(message);
    }

    protected void waitUntilLocatorIsVisible(WebElement element, int insSecondsMax) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(insSecondsMax));
        wait.until(ExpectedConditions.visibilityOf(element));
        String message = "wait until" + element + "is visible";
        System.out.println(message);
    }

    protected void checkIfPageTitleContains(String pageTitle, String expected) {
        String message = "CHECK_IF" + pageTitle + "CONTAINS" + expected;
        System.out.println(message);
        Assert.assertTrue(pageTitle.contains(expected));
    }

    protected String getPageTitle() {
        String  title = driver.getTitle();
        String message = "Page title is : " + title;
        System.out.println(message);
        return title;
    }

    public static void waitForPageToLoad(long timeOutInSeconds) {
        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            }
        };
        try {
            WebDriverWait wait = new WebDriverWait(Driver.get(), Duration.ofSeconds(timeOutInSeconds));
            wait.until(expectation);
        } catch (Throwable error) {
            error.printStackTrace();
        }
    }
}