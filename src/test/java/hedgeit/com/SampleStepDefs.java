package hedgeit.com;

import com.rest.hedgeit.HedgeItTradeGet;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.List;
import cucumber.api.DataTable;
import org.testng.Assert;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import org.testng.Assert;


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
        Trade.GetRequest(circuitAPI);
    }

    @Then("^I receive the JSON array of (\\d+) records$")
    public void iReceiveTheJSONArrayOfRecords(int int1) throws Throwable {
        Trade.assertRecords(int1);
    }

    @Given("^an instance of HedgeIt that contains following trade (\\d+)$")
    public void instanceOfHedgeItTrade(int arg1) throws Exception {
        System.out.println(arg1);

    }

    @When("^I request that trade using following ReST API \"([^\"]*)\"$")
    public void getTradeAPI(String API) throws Exception {
        //System.out.println("API is : "+API);
        int code = get(API).getStatusCode();
        System.out.println(code);
        Assert.assertEquals(code, 200);
    }

    @Then("^I receive the following JSON array with following:$")
    public void i_receive_the_following_JSON_array_with_following(DataTable table) throws Exception {
        List<List<String>> data = table.raw();
        System.out.println(" "+data.get(0).get(1));
        System.out.println(" "+data.get(1).get(1));

    }

}
