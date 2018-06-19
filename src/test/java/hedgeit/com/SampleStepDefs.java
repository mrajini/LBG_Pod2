package hedgeit.com;

        import com.rest.hedgeit.HedgeItTradeGet;
        import cucumber.api.PendingException;
        import cucumber.api.java.en.Given;
        import cucumber.api.java.en.Then;
        import cucumber.api.java.en.When;
        import java.util.List;
        import cucumber.api.DataTable;
        import io.restassured.response.ResponseBody;
        import org.testng.Assert;

        import static com.sun.corba.se.impl.util.Version.asString;
        import static io.restassured.RestAssured.*;
        import io.restassured.response.Response;
        import org.testng.Assert;


public class SampleStepDefs {
    String APIPath;
    int id;
    HedgeItTradeGet Trade = new HedgeItTradeGet();

    @Given("^I requested (\\d+) trades$")
    public void I_have_cukes_in_my_belly(int cukes) throws Throwable {
        SamplePage belly = new SamplePage();
        belly.eat(cukes);
    }


    @When("^I wait (\\d+) hour$")
    public void iWaitHour(int arg0) throws Throwable {
        System.out.println("Wait for "+arg0+" hours");
    }

    @Then("verify trade requested are (\\d+)")
    public void my_belly_should_growl(int cukes) throws Throwable {
        SamplePage belly = new SamplePage();
        //System.out.println("step three");
        belly.eat(cukes);
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
    public void instanceOfHedgeItTrade(int hedgeitID) throws Exception {
        System.out.println(hedgeitID);
        id = hedgeitID;

    }

    @When("^I request that trade using following Rest API \"([^\"]*)\"$")
    public void getTradeAPI(String API) throws Exception {
        //System.out.println("API is : "+API);
        APIPath = API;
        int code = get(APIPath).getStatusCode();
        System.out.println(code);
        Assert.assertEquals(code, 200);
    }


    @Then("^I receive the following JSON array with following:$")
    public void i_receive_the_following_JSON_array_with_following(DataTable table) throws Exception {
        List<List<String>> data = table.raw();
        String Expected_TradeName = data.get(0).get(1);
        System.out.println("Expected Trade name is "+ " " +data.get(0).get(1));
        String body=get(APIPath+"/"+id).asString();
        long time=get(APIPath+"/"+id).getTime();
        Assert.assertEquals(body.contains(Expected_TradeName), true , "Response body contains"+ Expected_TradeName);

        String Expected_TradeMode = data.get(1).get(1);
        System.out.println("Expected Trade Mode is "+data.get(1).get(1));
        Assert.assertEquals(body.contains(Expected_TradeMode),true,"Response body contains"+ Expected_TradeMode);


        String Expected_Date = data.get(2).get(1);
        System.out.println("Expected Date is " +data.get(2).get(1));
        Assert.assertEquals(body.contains(Expected_Date),true,"Response body contains"+ Expected_Date);

        System.out.println("Data is : "+body);
        System.out.println("Response Time "+time);

    }

}
