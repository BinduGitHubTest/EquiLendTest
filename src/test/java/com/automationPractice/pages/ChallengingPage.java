package com.automationPractice.pages;

import com.automationPractice.base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChallengingPage extends BasePage {

    @FindBy(css = ".button.alert")
    WebElement redButton;

    @FindBy(css = ".button")
    WebElement blueButton;

    @FindBy(css = ".button.success")
    WebElement greenButton;

    private String blueButtonId;
    private String redButtonId;
    private String greenButtonId;

    public ChallengingPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void clickOnButton(String buttonName) {
        waitForPageToLoad(60);
        WebElement actualButton = null;
        switch (buttonName) {
            case "Red":{
                actualButton = redButton;
                break;
            }

        }
        waitUntilLocatorIsVisible(actualButton, 15);
        getButtonIdsBeforeRedClick();
        clickOn(actualButton);
    }

    public void getButtonIdsBeforeRedClick() {
        blueButtonId = blueButton.getAttribute("id");
        redButtonId = redButton.getAttribute("id");
        greenButtonId = greenButton.getAttribute("id");
    }

    public void verifyTheButtonIdsAreChanged() {
        Assert.assertNotEquals(blueButton.getAttribute("id"), blueButtonId);
        Assert.assertNotEquals(redButton.getAttribute("id"), redButtonId);
        Assert.assertNotEquals(greenButton.getAttribute("id"), greenButtonId);
    }
}
