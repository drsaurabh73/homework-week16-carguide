package au.com.carsguide.steps;

import au.com.carsguide.pages.CarDealerPage;
import au.com.carsguide.pages.HomePage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class DealerTest {
    @And("^I click on Used Cars  Dealer link  page$")
    public void iClickOnUsedCarsDealerLinkPage() {
        new HomePage().setCardealer();

    }

    @Then("^I see the dealer list$")
    public void iSeeTheDealerList(DataTable dataTable) {
        List<String> userList = dataTable.asList(String.class);
        for (String data : userList) {
            while (new CarDealerPage().getCardealername(data)==null) {
                new CarDealerPage().setNextbutton();
            }
            Assert.assertEquals("Cardealer not found",data, new CarDealerPage().getCardealername(data));
        }


    }
}
