package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ("src/test/java/features"),

        plugin = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"},
        //glue=   "steps"
        tags = "@Unit"


)

public class Runner {
}
