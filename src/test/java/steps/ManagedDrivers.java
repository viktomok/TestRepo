package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import framework.config.ConfigReader;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static framework.base.DriverContext.driver;

public class ManagedDrivers {

    private static final String CHROME_BROWSER_PATH = "src//main//java//framework//utilities//browserutil//chromedriver.exe";


    @Before
    public static void startBrowserSession() throws IOException {

        ConfigReader.populateSettings();

        Properties p = new Properties();
        FileInputStream fis = new FileInputStream("src//main//java//framework//config//global.properties");
        p.load(fis);
        p.getProperty("browser");

        if (p.getProperty("browser").contains("headless")) {
            driver = new HtmlUnitDriver();

        } else if (p.getProperty("browser").contains("firefox")) {
            System.setProperty("webdriver.gecko.driver", "src//main//java//framework//utilities//browserutil//geckodriver.exe");
            FirefoxBinary firefoxBinary = new FirefoxBinary();
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            firefoxOptions.setBinary(firefoxBinary);
            firefoxBinary.addCommandLineOptions("--headless");
            driver = new FirefoxDriver();

        } else if (p.getProperty("browser").contains("chrome")) {
            System.setProperty("webdriver.chrome.driver", CHROME_BROWSER_PATH);
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments( "--headless" );
            driver = new ChromeDriver();



        } else if (p.getProperty("browser").contains("ie")) {
            System.setProperty("webdriver.ie.driver", "src//main//java//framework//utilities//browserutil//IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }
    }


    @Test
    public static void maximizeWindow() {
        driver.manage().window().maximize();
    }

    //@Ignore
    @After
    public static void closeBrowserSession(Scenario scenario) throws InterruptedException {

        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
            Thread.sleep(7000);
        }
        //Running test headlessly with @after method active impacts overall performance
        //Deactivate method before pushing code and set browser to headless in global properties
        driver.manage().deleteAllCookies();
        driver.close();
    }




}