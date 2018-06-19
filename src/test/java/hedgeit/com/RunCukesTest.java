package hedgeit.com;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "./src/test/resources/hedgeit/com",
        plugin = {"pretty","html:target/reportshtml","json:target/reportsjson"},
        tags = {"@FunctionalTest"}
)



public class RunCukesTest {


}
