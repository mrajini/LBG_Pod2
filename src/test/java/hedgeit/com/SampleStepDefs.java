package hedgeit.com;

import cucumber.api.java.en.Given;

public class SampleStepDefs {
    @Given("^I have (\\d+) cukes in my belly$")
    public void I_have_cukes_in_my_belly(int cukes) throws Throwable {
        SamplePage belly = new SamplePage();
        belly.eat(cukes);
    }
}
