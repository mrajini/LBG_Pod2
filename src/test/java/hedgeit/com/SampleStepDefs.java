package hedgeit.com;

import com.rest.hedgeit.HedgeItTradeGet;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;



public class SampleStepDefs {
    String APIPath;
    HedgeItTradeGet Trade = new HedgeItTradeGet();

    @Given("^I have (\\d+) cukes in my belly$")
    public void I_have_cukes_in_my_belly(int cukes) throws Throwable {
        SamplePage belly = new SamplePage();
        belly.eat(cukes);
    }

    @When("I wait {int} hour")
    public void i_wait_hour(Integer int1) throws Throwable {
        System.out.print("step two");
    }

    @Then("my belly should growl")
    public void my_belly_should_growl() throws Throwable {
        SamplePage belly = new SamplePage();
        System.out.print("step three");
    }

    @Given("An instance of Ergast motor racing season {int}")
    public void an_instance_of_Ergast_motor_racing_of_season(Integer int1) throws Throwable {
        Trade.racingSeason(int1);
    }

    @When("I request circuit data of season using the ReST API {string}")
    public void i_request_that_trade_using_the_ReST_API(String circuitAPI) throws Throwable {
        //get(circuitAPI);
        /* APIPath = circuitAPI;
        get(APIPath).
                then().
                assertThat().
                statusCode(200); */
        Trade.GetRequest(circuitAPI);

    }

    @Then("I receive the JSON array of {int} records")
    public void i_receive_the_JSON_array_of_records(Integer int1) throws Throwable {
        /* get(APIPath).
                then().
                assertThat().
                body("MRData.CircuitTable.Circuits.circuitId", hasSize(20)); */

        Trade.assertRecords(int1);
    }
}
