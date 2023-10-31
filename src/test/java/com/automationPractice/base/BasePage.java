package com.automationPractice.base;

import com.automationPractice.utils.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage extends BaseActions{

    public BasePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(Driver.get(), this);
    }
}
