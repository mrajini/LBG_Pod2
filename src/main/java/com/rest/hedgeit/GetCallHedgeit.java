package com.rest.hedgeit;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.CoreMatchers.*;


public class GetCallHedgeit {

    @Test
    public void getCall() {

    given().
    when().
        get("http://ergast.com/api/f1/2017/circuits.json").
    then().
        assertThat().statusCode(200);

    }


}
