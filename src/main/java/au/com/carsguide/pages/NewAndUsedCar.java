package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAndUsedCar extends Utility {

    private static final Logger log = LogManager.getLogger(NewAndUsedCar.class.getName());

    public NewAndUsedCar() {
        PageFactory.initElements(driver,"this");
    }


    @FindBy(xpath = "//h1[contains(text(),'New & Used Car Search - carsguide')]")
    WebElement newandusedcar;


    @FindBy(xpath = "//select[@id='makes']")
    WebElement carmake;

    @FindBy(xpath = "//select[@id='models']")
    WebElement carmodel;

    @FindBy(xpath = "//select[@id='locations']")
    WebElement locationofcar;

    @FindBy(xpath = "//select[@id='priceTo']")
    WebElement carprice;

    @FindBy(xpath = "//input[@value='Find My Next Car']")
    WebElement mynextcar;

    @FindBy(xpath = "//h1[contains(text(),'Used Cars For Sale')]")
    WebElement usedcarforsale;




    public String verifyTextNewAndUsedCar() {
        return getTextFromElement(newandusedcar);
    }

    public void setCarmake(String make) {
        selectByVisibleTextFromDropDown(carmake,make);
    }

    public void setCarmodel(String model) {
        selectByVisibleTextFromDropDown(carmodel,model);
    }

    public void setLocation(String location){
        selectByValueFromDropDown(locationofcar,location);
    }

    public void setPrice(String price) {
        selectByValueFromDropDown(carprice,price);
    }

    public void setFindMynextcar() {
        clickOnElement(mynextcar);
    }

    public String VerifyUsedCarText() {
        return getTextFromElement(usedcarforsale);
    }

}
