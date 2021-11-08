package steps;

import Domain.LoginDomain;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.GlobalNavMenuPage;

import java.util.concurrent.TimeUnit;

import static framework.base.DriverContext.driver;



public class LandingPageNavSteps {

    GlobalNavMenuPage siteNavigation = new GlobalNavMenuPage();
    BasePage basePage = new BasePage();


    //1st Level Navigation Steps

    @When("They sign into the website")
    public void theySignIntoTheWebsite() {
        LoginDomain siteLogin = new LoginDomain();
        siteLogin.kkiLogin();
    }

    @And("They click on Therapy Areas main menu link")
    public void theyClickOnTherapyAreasMainMenuLink() {
        GlobalNavMenuPage siteNavigation = new GlobalNavMenuPage();
        siteNavigation.setClickTherapyAreasMainMenuLink();
    }

    @Then("The opened page displays Therapy Areas as title text")
    public void theOpenedPageDisplaysTherapyAreasAsTitleText() {
        GlobalNavMenuPage siteNavigation = new GlobalNavMenuPage();
        String LandingPageText = siteNavigation.getTAlandingPageTitleText();
        System.out.println(LandingPageText);
        String eTAtext = "Therapy Areas";
        String aTAtext = LandingPageText;
        Assert.assertEquals(aTAtext, eTAtext);

    }

    @And("The browser is closed")
    public void theBrowserIsClosed() {
        //basePage.tearDown();
    }

    @And("They click on the Our Products main menu link")
    public void TheyClickOnTheOurProductsMainMenuLink() throws InterruptedException {
        siteNavigation.setClickOurProductsMainMenuLink();
        Thread.sleep(4000);


    }

    @Then("The opened page displays Our Products as title text")
    public void TheOpenedPageDisplaysOurProductsAsTitleText() {
        siteNavigation.getOPlandingPageTitleText();
    }





    //2nd Level Navigation Steps

    @And("Then click the Gastrointestinal second Level menu link")
    public void thenClickTheGastrointestinalSecondLevelMenuLink() throws InterruptedException {
        siteNavigation.setClickTherapyAreasGastrointlLink();
        Thread.sleep(4000);
    }


    @Then("The opened page displays Gastrointestinal as title text")
    public void theOpenedPageDisplaysGastrointestinalAsTitleText() {
        siteNavigation.getGastroIntestinalTextElement();
    }

    @And("Then click the Oncology second Level menu link")
    public void thenClickTheOncologySecondLevelMenuLink() throws InterruptedException {
        siteNavigation.setClickTherapyAreasOncologyLink();
        Thread.sleep(4000);

    }

    @Then("The opened page displays Oncology as title text")
    public void theOpenedPageDisplaysOncologyAsTitleText() {
        siteNavigation.getOncologyTextElement();
    }

    @And("Then click the Neurology second Level menu link")
    public void thenClickTheNeurologySecondLevelMenuLink() throws InterruptedException {
        siteNavigation.setClickThrapyAreasNeurologyLink();
        Thread.sleep(4000);

    }

    @Then("The opened page displays Neurology as title text")
    public void theOpenedPageDisplaysNeurologyAsTitleText() {
        siteNavigation.getNeurologyTextElement();
    }

    @And("Then click the OPGastrointestinal second Level menu link")
    public void thenClickTheOPGastrointestinalSecondLevelMenuLink() throws InterruptedException {
        siteNavigation.setClickOurProductsGastrointLink();
        Thread.sleep(3000);

    }

    @Then("The opened page displays Gastrointestinal\\(OP) as title text")
    public void theOpenedPageDisplaysGastrointestinalOPAsTitleText() {
        siteNavigation.getOPGastroTextElement();
    }

    @And("Then click the OPOncology second Level menu link")
    public void thenClickTheOPOncologySecondLevelMenuLink() throws InterruptedException {
        siteNavigation.setClickOurProductsOncologyLink();
        Thread.sleep(4000);

    }

    @Then("The opened page displays Oncology\\(OP) as title text")
    public void theOpenedPageDisplaysOncologyOPAsTitleText() {
        siteNavigation.getOPOncologyTextElement();
    }





    //3rd Level Navigation Steps

    @And("Then click the Opioid Induced Constipation third level link")
    public void thenClickTheOpioidInducedConstipationThirdLevelLink() {
        siteNavigation.setClickTherapyAreasOIClink();
    }

    @Then("The opened page displays Opioid Induced Constipation as title text")
    public void theOpenedPageDisplaysOpioidInducedConstipationAsTitleText() {
        siteNavigation.getTaOICtextElement();
    }

    @And("Then click the Chronic Anal Fissure third level link")
    public void thenClickTheChronicAnalFissureThirdLevelLink() {
        siteNavigation.setClickTherapyAreasCAFlink();
    }

    @Then("The opened page displays Chronic Anal Fissure as title text")
    public void theOpenedPageDisplaysChronicAnalFissureAsTitleText() {
        siteNavigation.getTaCAFtextElement();
    }

    @And("Then click the Breakthrough Cancer Pain third level link")
    public void thenClickTheBreakthroughCancerPainThirdLevelLink() {
        siteNavigation.setClickTherapyAreasBTcPlink();
    }

    @Then("The opened page displays Breakthrough Cancer Pain as title text")
    public void theOpenedPageDisplaysBreakthroughCancerPainAsTitleText() {
        siteNavigation.getTaBTcPtextElement();
    }

    @And("Then click the Parkinsons Disease third level link")
    public void thenClickTheParkinsonsDiseaseThirdLevelLink() {
        siteNavigation.setClickTherapyAreasParkinsonslink();
    }

    @Then("The opened page displays Parkinsons Disease as title text")
    public void theOpenedPageDisplaysParkinsonsDiseaseAsTitleText() {
        siteNavigation.getTaParkinsonsTextElement();
    }

    @And("Then click the Opioid Induced Constipation third level link for OP")
    public void thenClickTheOpioidInducedConstipationThirdLevelLinkForOP() {
        siteNavigation.setClickOurProductsOIClink();
    }

    @Then("The opened page displays Opioid Induced Constipation as title text for OIC-OP")
    public void theOpenedPageDisplaysOpioidInducedConstipationAsTitleTextForOICOP() {
        siteNavigation.getopOICtextElement();
    }

    @And("Then click the Chronic Anal Fissure third level link for OP")
    public void thenClickTheChronicAnalFissureThirdLevelLinkForOP() {
        siteNavigation.setClickOurProductsCAFlink();
    }

    @Then("The opened page displays Chronic Anal Fissure as title text for OIC-OP")
    public void theOpenedPageDisplaysChronicAnalFissureAsTitleTextForOICOP() {
        siteNavigation.getOpCAFtextElement();
    }
}
