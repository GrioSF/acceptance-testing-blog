package acceptance.steps;


import acceptance.pages.AmazonHomePage;
import acceptance.pages.ProductSearchResultsPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AmazonSearchSteps {
    WebDriver webDriver = new FirefoxDriver();
    AmazonHomePage homePage = new AmazonHomePage(webDriver);
    ProductSearchResultsPage resultsPage = new ProductSearchResultsPage(webDriver);


    @Given("^an anonymous user$")
    public void setupAnonymousUser() throws Throwable {

    }

    @When("^I go to Amazon Home Page$")
    public void goToGoogleHomePage() throws Throwable {
        homePage.go();
    }

    @When("^I search for \"([^\"]*)\"$")
    public void searchForTerm(String term) throws Throwable {
        homePage.searchForProduct(term);
    }

    @Then("^the products results page displays a list of results containing product$")
    public void assertSearchResultsContainsResultForProduct(String productName) throws Throwable {
        resultsPage.assertResultsContainProduct(productName);
    }
}
