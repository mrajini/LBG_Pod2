package com.rest.hedgeit;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class HedgeItTradeGet {
        String APIPath;
    public void racingSeason(int year) {
            System.out.println("Racing season is "+year);
    }

    public void getCircuitData(String year) {
            System.out.println("Racing season is "+year);
    }

    public void GetRequest(String circuitAPI) {
        APIPath = circuitAPI;
        get(APIPath).
                then().
                assertThat().
                statusCode(200);
    }

    public void assertRecords(int size) {
        get(APIPath).
                then().
                assertThat().
                body("MRData.CircuitTable.Circuits.circuitId", hasSize(20));
    }

}
