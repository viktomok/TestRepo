package pages;

import framework.base.Base;
import framework.config.Settings;

import static framework.base.DriverContext.driver;

public class LandingPage extends Base {

    public void launchBaseUrl(){

        driver.get(Settings.engbKyowakirinHubUrl);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

    }
}