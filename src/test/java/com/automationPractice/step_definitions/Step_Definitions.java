package com.automationPractice.step_definitions;

import com.automationPractice.pages.ChallengingPage;
import com.automationPractice.pages.DynamicControlsPage;
import com.automationPractice.pages.WelcomePage;
import com.automationPractice.utils.ConfigurationReader;
import com.automationPractice.utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definitions {
    private final WelcomePage welcomePage;
    private final DynamicControlsPage dynamicControlsPage;
    private final ChallengingPage challengingPage;
    public Step_Definitions() {
        welcomePage = new WelcomePage(Driver.get());
        dynamicControlsPage = new DynamicControlsPage(Driver.get());
        challengingPage = new ChallengingPage(Driver.get());
    }

    @Given("the user is on test page")
    public void theUserIsOnTestPage() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("the user clicks on Dynamic Controls")
    public void theUserClicksOnDynamicControls() {
        welcomePage.clickOnDynamicControls();
    }

    @And("the user clicks on Remove button")
    public void theUserClicksOnRemoveButton() {
        dynamicControlsPage.clickOnRemoveButton();
    }

    @Then("verify the text {string} is rendered")
    public void verifyTheTextItsGoneIsRendered(String text) {
        dynamicControlsPage.verifyText(text);
    }

    @When("the user clicks on ChallengingDomPage")
    public void theUserClicksOnChallengingDomPage() {
        welcomePage.clickOnChallenginDomPage();
    }

    @And("the user clicks on {string} button")
    public void theUserClicksOnRedButton(String buttonName) {
        challengingPage.clickOnButton(buttonName);
    }

    @Then("verify the ids of blue red and green buttons are changed")
    public void verifyTheIdsOfBlueRedAndGreenButtonsAreChanged() {
        challengingPage.verifyTheButtonIdsAreChanged();
    }

}
