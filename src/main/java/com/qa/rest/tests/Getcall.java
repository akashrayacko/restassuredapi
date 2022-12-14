package com.qa.rest.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import  static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class Getcall {

    @Test
    public void test_numberofCircuitsFor2017_season() {

        //given()
        //when()
        //then()
        //assert()

                given().
                when().
                get("http://ergast.com/api/f1/2017/circuits.json").
                then().
                        assertThat().

                        statusCode(200).

                        and().

                        body("MRData.CircuitTable.Circuits.circuitId",hasSize(20));

                        and().

                        header("content-length", equalTo("4552"));


    }
    
    @Test
    public void test_add_Post() {

        JSONObject obj= new JSONObject();
        obj.put("name","Akash");
        obj.put("job","SDET");
        baseURI="https://reqres.in/api";

        given().body(obj.toString()).
                when().
                post("/users");


    }
}
