package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'buy + sell')]")
    WebElement buyandsell;


    @FindBy(xpath = "//a[contains(text(),'Search Cars')]")
    WebElement searchcar;

    @FindBy(xpath = "//div[@class='uhf-child-menu']//ul//li//a[text()='Used']")
    WebElement usedcar;

    @FindBy(xpath = "//div[@class='heading main-heading item-ad-wrapper ']/h1")
    WebElement usedcarforsale;

    @FindBy(xpath = "//a[contains(text(),'Find a Dealer')]")
    WebElement cardealer;


    public void setBuyandsell() {
        mouseHoverToElement(buyandsell);
    }

    public void setSearchcar() {
        clickOnElement(searchcar);
    }

    public void setUsedcar() {
        mouseHoverToElementAndClick(usedcar);
    }

    public void setCardealer() { clickOnElement(cardealer); }
}
