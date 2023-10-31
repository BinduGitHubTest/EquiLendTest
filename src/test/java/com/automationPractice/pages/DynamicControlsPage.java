package com.automationPractice.pages;

import com.automationPractice.base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicControlsPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"checkbox-example\"]/button")
    WebElement removeButton;

    @FindBy(xpath = "//*[@id=\"checkbox-example\"]/button")
    WebElement addButton;

    @FindBy(xpath = "//*[@id=\"message\"]")
    WebElement itsGoneText;

    public DynamicControlsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void clickOnRemoveButton() {
        waitForPageToLoad(10);
        waitUntilLocatorIsVisible(removeButton, 10);
        clickOn(removeButton);
        waitUntilLocatorIsVisible(addButton, 10);
    }

    public void verifyText(String text) {
        waitUntilLocatorIsVisible(itsGoneText, 10);
        Assert.assertTrue(itsGoneText.getText().equalsIgnoreCase(text));
    }
}

