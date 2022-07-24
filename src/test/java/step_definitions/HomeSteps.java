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


    @Then("Verify {string} headers is displayed")
    public void verifyHeadersIsDisplayed(String header) {
        Assert.assertTrue(WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_TEXT, header))));
    }

    @And("Verify {string} descriptions under header")
    public void verifyDescriptionsUnderHeader(String desc) {
        WebDriverManager.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT, desc)));
    }

    @Then("Verify headers as {string} is displayed and description under")
    public void verifyHeadersAsIsDisplayedAndDescriptionUnder(String header) {
        Assert.assertTrue(WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_TEXT, header))));
        System.out.println(WebDriverManager.getText(homePage.textDescription_1));
    }

    @When("User see headers as {string}")
    public void userSeeHeadersAs(String headerText) {
        switch (headerText){
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


}
