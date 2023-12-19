package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ComputerSteps {
    @When("I click on computer tab")
    public void iClickOnComputerTab() {
        new HomePage().clickOnComputersTabLink();
    }

    @And("I should verify the computer text {string}")
    public void iShouldVerifyTheComputerText(String computerText) {
        Assert.assertEquals(new ComputerPage().getComputerText(), computerText, "verified");
    }

    @And("I click on desktops tab")
    public void iClickOnDesktopsTab() {
        new ComputerPage().clickOnDesktopTabLink();
    }

    @And("I should verify the desktops text {string}")
    public void iShouldVerifyTheDesktopsText(String desktop) {
        Assert.assertEquals(new ComputerPage().getDesktopsLinkText(), desktop, "verified");

    }

    @And("I click on build your own computer")
    public void iClickOnBuildYourOwnComputer() {
        new BuildYourOwnComputerPage().clickOnBuildYourOwnComputer();
    }

    @And("I select processor {string}")
    public void iSelectProcessor(String processor) {
        new BuildYourOwnComputerPage().selectProcessor(processor);
    }

    @And("I select ram {string}")
    public void iSelectRam(String ram) {
        new BuildYourOwnComputerPage().selectRam(ram);
    }

    @And("I select Hdd radio {string}")
    public void iSelectHddRadio(String hdd) {
        new BuildYourOwnComputerPage().selectHDD(hdd);
    }

    @And("I select OS radio {string}")
    public void iSelectOSRadio(String os) {
        new BuildYourOwnComputerPage().selectOS(os);
    }

    @And("I select software {string}")
    public void iSelectSoftware(String software) {
        new BuildYourOwnComputerPage().selectSoftware(software);
    }

    @And("I click on add to cart button")
    public void iClickOnAddToCartButton() {
        new BuildYourOwnComputerPage().clickOnAddToCartButton();
    }

    @Then("I should verify the add to cart message{string}")
    public void iShouldVerifyTheAddToCartMessage(String allDone) {
        Assert.assertEquals(new BuildYourOwnComputerPage().getProductAddedMessage(), allDone, "not Done Yet");

    }
}