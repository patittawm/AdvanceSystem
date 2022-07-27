package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.CommonPage;
import pages.HomePage;
import utils.CucumberLogUtils;
import utils.SeleniumUtils;
import utils.WebDriverManager;

public class HomeSteps implements CommonPage {
    HomePage homePage;

    public HomeSteps(){
        homePage = new HomePage();
    }

    @Then("Verify {string} link is displayed")
    public void verifyLinkIsDisplayed(String linkName) {
        Assert.assertTrue(WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_LINKTEXT, linkName))));
    }

    @Then("Verify {string} link is enabled")
    public void verifyLinkIsEnabled(String linkLanguage) {
        WebDriverManager.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_LINKTEXT, linkLanguage)));
    }

    @Then("user can click dropdown for change language")
    public void userCanClickDropdownForChangeLanguage() {
        WebDriverManager.click(homePage.dropdownLanguage);
    }
    
    @When("User clicks on {string}")
    public void user_clicks_on(String linkBtn) {
        WebDriverManager.click(By.xpath(String.format(XPATH_TEMPLATE_LINKTEXT, linkBtn)));
    }

    @When("User switches to the next window")
    public void user_switches_to_the_next_window() {

        SeleniumUtils.switchToNextWindow();
    }

    @Then("Verify title of the page is {string}")
    public void verifyTitleOfThePageIs(String title) {
        Assert.assertEquals(title, WebDriverManager.getDriver().getTitle());
    }

    @When("User see headers as {string}")
    public void userSeeHeadersAs(String h3Header) {
        Assert.assertTrue(WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_LINKTEXT_H3, h3Header))));
    }

    @Then("Verify {string} is displayed under header")
    public void verifyIsDisplayedUnderHeader(String des) {
        switch (des){
            case "Leadership Development":
                Assert.assertTrue(WebDriverManager.isDisplayed(homePage.textDescription_1));
                break;
            case "Capability Building":
                Assert.assertTrue(WebDriverManager.isDisplayed(homePage.textDescription_2));
                break;
            case "Reward & Benefits":
                Assert.assertTrue(WebDriverManager.isDisplayed(homePage.textDescription_3));
                break;
            case "Employee & Industrial":
                Assert.assertTrue(WebDriverManager.isDisplayed(homePage.textDescription_4));
                break;
            case "Delivering Excellent":
                Assert.assertTrue(WebDriverManager.isDisplayed(homePage.textDescription_5));
                break;
        }
    }
    @When("User scrolls down page to footer information")
    public void userScrollsDownThePageToTheEnd() {
        SeleniumUtils.moveIntoView(homePage.footerInfo);
    }
    @Then("Verify footer {string} is displayed")
    public void verifySecondaryHeaderLinkIsDisplayed(String info) {
        switch (info) {
            case "Address: 10090 Main St, Fairfax, VA":
                Assert.assertTrue(WebDriverManager.isEnabled(homePage.infoAddress));
                break;
            case "Phone: +1 703-831-3217":
                Assert.assertTrue(WebDriverManager.isDisplayed(homePage.infoPhone));
                break;
            case "Email: Info@advancesystems.us":
                Assert.assertTrue(WebDriverManager.isDisplayed(homePage.infoEmail));
                break;
            case "Mon to Sat: 9.00 am to 5:00 pm":
                Assert.assertTrue(WebDriverManager.isDisplayed(homePage.infoHour));
                break;

        }
    }

    @Then("Verify {string} button is displayed")
    public void verifyButtonIsDisplayed(String joinnow) {
        Assert.assertTrue(WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_LINKTEXT, joinnow))));
    }

    @Then("User switches to {string} page")
    public void userSwitchesToPage(String joinUs) {
        Assert.assertTrue(WebDriverManager.isDisplayed(homePage.joinUsStickyHeaderLink));
    }


//Add comment for test how to make it work on git hub

}