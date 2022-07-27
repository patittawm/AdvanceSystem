package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverManager;

public class HomePage {
    public HomePage(){

        PageFactory.initElements(WebDriverManager.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='icon fa fa-angle-down']")
    public WebElement dropdownLanguage;

    @FindBy(xpath = "//div[@class='flex-box']/div[1]//div[@class='text']")
    public WebElement textDescription_1;

    @FindBy(xpath = "//div[@class='flex-box']/div[2]//div[@class='text']")
    public WebElement textDescription_2;

    @FindBy(xpath = "//div[@class='flex-box']/div[3]//div[@class='text']")
    public WebElement textDescription_3;

    @FindBy(xpath = "//div[@class='flex-box']/div[4]//div[@class='text']")
    public WebElement textDescription_4;

    @FindBy(xpath = "//div[@class='flex-box']/div[5]//div[@class='text']")
    public WebElement textDescription_5;

    @FindBy(xpath = "//div[@class='footer-about footer-column-border col-lg-4 col-md-6 col-sm-6 col-xs-12']")
    public WebElement footerInfo;

    //============Information================
    @FindBy(xpath = "//*[@class='list-info']//li[1]")
    public WebElement infoAddress;

    @FindBy(xpath = "//*[@class='list-info']//li[2]")
    public WebElement infoPhone;

    @FindBy(xpath = "//*[@class='list-info']//li[3]")
    public WebElement infoEmail;

    @FindBy(xpath = "//*[@class='list-info']//li[4]")
    public WebElement infoHour;

}
