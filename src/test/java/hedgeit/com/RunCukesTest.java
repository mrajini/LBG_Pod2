package hedgeit.com;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"/Users/Rajini1/Documents/LBGWorkspace/LBG_Pod2/src/test/resources/hedgeit/com/sample.feature"},
        plugin = {"pretty","html:target/reportshtml","json:target/reportsjson"},
        tags = {"@Rajini"

}
)


public class RunCukesTest {
}
