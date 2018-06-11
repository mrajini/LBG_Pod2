package hedgeit.com;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "io.cucumber.pro.JsonReporter:all"},
tags = "@FuntionalTest")
public class RunCukesTest {
}
