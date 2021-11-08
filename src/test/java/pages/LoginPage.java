package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static framework.base.DriverContext.driver;

public class LoginPage {
    private By clickAcceptCookies = By.cssSelector(".cookie-banner__controls-primary > .chevron-button-component:nth-child(1)");
    private By clickloginRegisterBtn = By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div[2]/div/a");
    private By enterUserEmail = By.id("email");
    private By enterUserPassword = By.id("password");
    private By clickContinueBtn = By.cssSelector("div.App div.app-layout div.login-page-component div.login-page-container div.page-content div.login-page-form div.tab-form-component form.form-component.form-component-wrapped div.form-field.form-field-button.form-field--50:nth-child(4) > button.custom-focus.ie-11-button-fix");
    private By userStatusName = By.cssSelector(".UserStatus_Name");


    public void setClickAcceptCookies(){
        driver.findElement(clickAcceptCookies).click();
    }
    public void setClickloginRegisterBtn(){
        driver.findElement(clickloginRegisterBtn).click();
    }
    public void setEnterUserEmail(){
        driver.findElement(enterUserEmail).sendKeys("victor.omokheoa@codeworldwide.com");
    }
    public void setEnterUserPassword(){
        driver.findElement(enterUserPassword).sendKeys("Password123!");
    }
    public void setClickContinueBtn(){
        driver.findElement(clickContinueBtn).click();
    }
    public String getUserStatusName() throws InterruptedException {
        WebElement statusName = new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(userStatusName));
        return statusName.getText();
    }


}
