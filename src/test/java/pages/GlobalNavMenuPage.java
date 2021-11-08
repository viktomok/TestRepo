package pages;

import org.apache.http.util.Asserts;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static framework.base.DriverContext.driver;

public class GlobalNavMenuPage {


    //Global Nav MAIN MENU BAR Login/Register Button
    private By clickloginRegisterBtn = By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div[2]/div/a");

    //Global Nav LEVEL 1 (MAIN MENU BAR KKI logo) items
    private By clickKKImainMenuLogo = By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/a/img");

    //Global Nav LEVEL 1 (MAIN MENU BAR THERAPY AREAS link)
    private By clickTherapyAreasMainMenuLink = By.cssSelector(".hasChild");


    //Global Nav LEVEL 2 navigation menu items for THERAPY AREAS (TA/Gastro, TA/Oncology and TA/Neurology)
    private By clickTherapyAreasGastrointlLink = By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/ul/li[1]/a");
    private By gastroIntestinalTextElement = By.xpath("//h1[text()='Gastrointestinal']");
    private By clickTherapyAreasOncologyLink = By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/ul/li[2]/a");
    private By oncologyTextElement = By.xpath("//h1[text()='Oncology']");
    private By clickThrapyAreasNeurologyLink = By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/ul/li[3]/a");
    private By neurologyTextElement = By.xpath("//h1[text()='Neurology']");

    //Global Nav LEVEL 3 navigation menu items for THERAPY AREAS/Gastrointestinal (TA/OIC and TA/CAF)
    private By clickTherapyAreasOIClink = By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/ul/li[1]/a");
    private By taOICtextElement = By.xpath("//h1[text()='Opioid-induced Constipation']");
    private By clickTherapyAreasCAFlink = By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/ul/li[2]/a");
    private By taCAFtextElement = By.xpath("//h1[text()='Chronic Anal Fissure']");

    //Global Nav LEVEL 3 navigation menu items for THERAPY AREAS/Oncology (TA/BTcP)
    private By clickTherapyAreasBTcPlink = By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/ul/li/a");
    private By taBTcPtextElement = By.xpath("//h1[text()='Breakthrough Cancer Pain']");

    //Global Nav LEVEL 3 navigation menu items for THERAPY AREAS/Neurology (TA/PD)
    private By clickTherapyAreasParkinsonslink = By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/ul/li/a");
    private By taParkinsonsTextElement = By.xpath("//h1[@class='title-section-title']");

    //Displayed Title element for Therapy Areas Landing Pages when opened
    private By TAlandingPageTitleText = By.xpath("//h1[contains(text(),'Therapy Areas')]");


//OUR PRODUCTS OBJECTS START HERE

    //Global Nav LEVEL 1 (MAIN MENU BAR OUR PRODUCTS link)
    private By clickOurProductsMainMenuLink = By.cssSelector("li:nth-child(2) > .hasChild");

    //Displayed Title element for Our Products Landing Pages when opened
    private By OPlandingPageTitleText = By.xpath("//h1[@class='title-section-title']");

    //Global Nav LEVEL 2 navigation menu items for OUR PRODUCTS (OP/Gastro and OP/Oncology)
    private By clickOurProductsGastrointLink = By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/ul/li[1]/a");
    private By OPGastroTextElement = By.xpath("//h1[text()='Gastrointestinal']");
    private By clickOurProductsOncologyLink = By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/ul/li[2]/a");
    private By OPOncologyTextElement = By.xpath("//h1[text()='Oncology']");

    //Global Nav LEVEL 3 navigation menu items for OUR PRODUCTS/Gastrointestinal (OP/OIC and OP/CAF)
    private By clickOurProductsOIClink = By.xpath("//a[text()='Opioid-induced Constipation (OIC)']");
    private By opOICtextElement = By.xpath("//h1[text()='Opioid-induced Constipation']");
    private By clickOurProductsCAFlink = By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/ul/li[2]/a");
    private By opCAFtextElement = By.xpath("//h1[text()='Chronic Anal Fissure']");

    //Global Nav LEVEL 3 navigation menu items for OUR PRODUCTS/Oncology (OP/BTcP)
    private By clickOurProductsBTcPlink = By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/ul/li/a");



    //Methods for Login/Register button and KKI Logo on the Main Menu bar
    public void setClickloginRegisterBtn(){
        driver.findElement(clickloginRegisterBtn).click();
    }

    public void setClickKKImainMenuLogo(){
        driver.findElement(clickKKImainMenuLogo).click();
    }



    //Method for Therapy Areas main menu link
    public void setClickTherapyAreasMainMenuLink(){
        new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(clickTherapyAreasMainMenuLink)).click();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    //Method for displayed TA Landing page content title text
    public String getTAlandingPageTitleText(){
        WebElement LandingPageText = new WebDriverWait(driver, 80).until(ExpectedConditions.presenceOfElementLocated(TAlandingPageTitleText));
        return LandingPageText.getText();
    }


    //Method for displayed Our Products Landing page content title TEXT
    public String getOPlandingPageTitleText(){
       WebElement OurProdLPText = new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(OPlandingPageTitleText));
       System.out.println("This is the " + OurProdLPText);
        String eOPText = "Our Products";
        String aOPText = OurProdLPText.getText();
        Assert.assertEquals(aOPText, eOPText);
        return OurProdLPText.getText();


    }



    //Therapy Areas 2nd level methods
    public void setClickTherapyAreasGastrointlLink(){
        driver.findElement(clickTherapyAreasGastrointlLink).click();
    }

    public String getGastroIntestinalTextElement(){
        String gastroText = new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(gastroIntestinalTextElement)).getText();
        System.out.println("This page is " + gastroText);
        return gastroText;
    }
    public void setClickTherapyAreasOncologyLink(){
        driver.findElement(clickTherapyAreasOncologyLink).click();
    }

    public String getOncologyTextElement(){
        String oncologyText = new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(oncologyTextElement)).getText();
        System.out.println("The Oncology landing page title is  " + oncologyText);
        return oncologyText;
    }
    public void setClickThrapyAreasNeurologyLink(){
        driver.findElement(clickThrapyAreasNeurologyLink).click();
    }
    public String getNeurologyTextElement(){
        String neurologyText = new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(neurologyTextElement)).getText();
        System.out.println("The Neurology landing page title is " + neurologyText);
        return neurologyText;
    }

    //Therapy Areas 3rd level methods
    public void setClickTherapyAreasOIClink(){
        new WebDriverWait(driver, 80).until(ExpectedConditions.elementToBeClickable(clickTherapyAreasOIClink)).click();
        //driver.findElement(clickTherapyAreasOIClink).click();
    }
    public String getTaOICtextElement(){
        String TaOICtext = new WebDriverWait(driver, 80).until(ExpectedConditions.presenceOfElementLocated(taOICtextElement)).getText();
        System.out.println(TaOICtext);
        return TaOICtext;

    }


    }