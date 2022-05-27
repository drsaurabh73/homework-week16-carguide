package au.com.carsguide.steps;

import au.com.carsguide.pages.HomePage;
import au.com.carsguide.pages.NewAndUsedCar;
import au.com.carsguide.pages.ResultPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class BuyCarTest {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I mouse hover on buy\\+sell tab of car page$")
    public void iMouseHoverOnBuySellTabOfCarPage() throws InterruptedException {
        Thread.sleep(1000);
        new HomePage().setBuyandsell();
    }

    @And("^I click on Search Cars link$")
    public void iClickOnSearchCarsLink() {
        new HomePage().setSearchcar();
    }


    @Then("^I navigate to \"([^\"]*)\" page$")
    public void iNavigateToPage(String message) {
        Assert.assertEquals("", message, new NewAndUsedCar().verifyTextNewAndUsedCar().substring(0, 21));
    }

    @And("^I select make \"([^\"]*)\" of the car$")
    public void iSelectMakeOfTheCar(String make) {
        new NewAndUsedCar().setCarmake(make);
    }

    @And("^I select model \"([^\"]*)\" of the car$")
    public void iSelectModelOfTheCar(String model) {
        new NewAndUsedCar().setCarmodel(model);

    }

    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String location) {
        new NewAndUsedCar().setLocation(location);
    }

    @And("^I select price \"([^\"]*)\" in the field$")
    public void iSelectPriceInTheField(String price) {
        new NewAndUsedCar().setPrice(price);
    }


    @And("^I click on Find My Next Car tab$")
    public void iClickOnFindMyNextCarTab() {
        new NewAndUsedCar().setFindMynextcar();
    }

    @Then("^I click on Find My Next Car \"([^\"]*)\" tab on page$")
    public void iClickOnFindMyNextCarTabOnPage(String message) {

        Assert.assertTrue(message, new ResultPage().verifyResult().contains(message));

    }


    @Then("^I navigate to \"([^\"]*)\" from used car page$")
    public void iNavigateToFromUsedCarPage(String message) {

        Assert.assertEquals("", message, new NewAndUsedCar().VerifyUsedCarText());
    }

//    @And("^I click on Find My Next Car \"([^\"]*)\" tab$")
//    public void iClickOnFindMyNextCarTab(String make)  {
//        Assert.assertEquals("not a required make",make, new NewAndUsedCar().verifyTextNewAndUsedCar().contains(make));
//
//    }

    @When("^I mouse hover on used car tab$")
    public void iMouseHoverOnUsedCarTab() {
        new HomePage().setUsedcar();
    }

//    @And("^I select make \"([^\"]*)\" of the used car$")
//    public void iSelectMakeOfTheUsedCar(String make) {
//        new NewAndUsedCar().setCarmake(make);
//    }
//
//    @And("^I select model \"([^\"]*)\" of the used car$")
//    public void iSelectModelOfTheUsedCar(String model) {
//        new NewAndUsedCar().setCarmodel(model);
//    }
//
//    @And("^I select location \"([^\"]*)\" of used car location$")
//    public void iSelectLocationOfUsedCarLocation(String location) {
//        new NewAndUsedCar().setLocation(location);
//    }
//
//    @And("^I select price \"([^\"]*)\" in the field price of used car$")
//    public void iSelectPriceInTheFieldPriceOfUsedCar(String price) {
//        new NewAndUsedCar().setPrice(price);
//    }

    @And("^I click on Find My Next  Used Car \"([^\"]*)\"  tab$")
    public void iClickOnFindMyNextUsedCarTab(String make) {

        Assert.assertEquals("not a required make", make, new NewAndUsedCar().verifyTextNewAndUsedCar().contains(make));
    }

    @And("^I click on Used Cars link on usedcar page$")
    public void iClickOnUsedCarsLinkOnUsedcarPage() {
        new HomePage().setUsedcar();
    }


}
