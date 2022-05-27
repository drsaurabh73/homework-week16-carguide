package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CarDealerPage extends Utility {
    private static final Logger log = LogManager.getLogger(CarDealerPage.class.getName());

    public CarDealerPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='dealerListing--name']//a")
    List<WebElement> cardealername;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Next')]")
    WebElement nextbutton;

    public void setNextbutton(){
        clickOnElement(nextbutton);
    }

    public String getCardealername(String text) {
        for (WebElement data : cardealername) {
            String str = data.getText();
            if (str.equalsIgnoreCase(text)) {
                return str;
            }
        }
        return null;

    }
}
