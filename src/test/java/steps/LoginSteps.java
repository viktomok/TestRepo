package steps;

import Domain.LoginDomain;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;
import pages.LandingPage;
import pages.LoginPage;

import static framework.base.DriverContext.driver;
import static org.junit.Assert.assertEquals;


public class LoginSteps {

    LandingPage landingPage = new LandingPage();
    LoginPage loginPage = new LoginPage();
    LoginDomain loginDomain = new LoginDomain();

    @Given("That a registered user has opened the {string} website")
    public void ThatARegisteredUserHasOpenedTheWebsite(String arg0) {

        landingPage.launchBaseUrl();
        loginPage.setClickAcceptCookies();
    }


    @When("they click on the Homepage {string} button")
    public void theyClickOnTheHomepageButton(String arg0) {
        loginPage.setClickloginRegisterBtn();
    }

    @And("they enter a valid {string}")
    public void theyEnterAValid(String arg0) {
        loginPage.setEnterUserEmail();
    }
    @And("they now enter a valid {string}")
    public void theyNowEnterAValid(String arg0) {
        loginPage.setEnterUserPassword();

    }

    @And("they click {string} button")
    public void theyClickButton(String arg0) {
        loginPage.setClickContinueBtn();
    }


    @Then("The home page displays user status name")
    public void theHomePageDisplaysUserStatusName() throws InterruptedException {
        System.out.println(loginPage.getUserStatusName());
        String statusName = loginPage.getUserStatusName();
        String eStatusName = "Victor";
        assertEquals(eStatusName, statusName);
    }


}
