package Domain;

import pages.LandingPage;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

import static framework.base.DriverContext.driver;

public class LoginDomain {
    LoginPage loginPage = new LoginPage();

    public void kkiLogin(){
        loginPage.setClickloginRegisterBtn();
        loginPage.setEnterUserEmail();
        loginPage.setEnterUserPassword();
        loginPage.setClickContinueBtn();


    }


}
