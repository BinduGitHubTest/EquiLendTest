package com.automationPractice.pages;

import com.automationPractice.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage extends BasePage {
    @FindBy(linkText = "Dynamic Controls")
    WebElement dynamicControlsLink;

    @FindBy(linkText = "Challenging DOM")
    WebElement challengingDomLink;

    public WelcomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickOnDynamicControls() {
        clickOn(dynamicControlsLink);
        waitUntilUrlContains("/dynamic_controls");
        checkIfPageTitleContains(getPageTitle(),"The Internet");
    }

    public void clickOnChallenginDomPage() {
        clickOn(challengingDomLink);
        waitUntilUrlContains("/challenging_dom");
        checkIfPageTitleContains(getPageTitle(),"The Internet");
    }
}

