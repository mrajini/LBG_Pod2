package hedgeit.com;

import com.rest.hedgeit.HedgeItTradeGet;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class SampleStepDefs {
    String APIPath;
    HedgeItTradeGet Trade = new HedgeItTradeGet();

    @Given("^I have (\\d+) cukes in my belly$")
    public void I_have_cukes_in_my_belly(int cukes) throws Throwable {
        SamplePage belly = new SamplePage();
        belly.eat(cukes);
    }


    @When("^I wait (\\d+) hour$")
    public void iWaitHour(int arg0) throws Throwable {
        System.out.print("step two");
    }

    @Then("my belly should growl")
    public void my_belly_should_growl() throws Throwable {
        SamplePage belly = new SamplePage();
        System.out.print("step three");
    }



    @Given("^An instance of Ergast motor racing season (\\d+)$")
    public void anInstanceOfErgastMotorRacingSeason(int int1) throws Throwable {
        Trade.racingSeason(int1);
    }

    @When("^I request circuit data of season using the ReST API \"([^\"]*)\"$")
    public void iRequestCircuitDataOfSeasonUsingTheReSTAPI(String circuitAPI) throws Throwable {
        //get(circuitAPI);
        /* APIPath = circuitAPI;
        get(APIPath).
                then().
                assertThat().
                statusCode(200); */
        Trade.GetRequest(circuitAPI);
    }

    @Then("^I receive the JSON array of (\\d+) records$")
    public void iReceiveTheJSONArrayOfRecords(int int1) throws Throwable {
         /* get(APIPath).
                then().
                assertThat().
                body("MRData.CircuitTable.Circuits.circuitId", hasSize(20)); */

        Trade.assertRecords(int1);
    }
}
