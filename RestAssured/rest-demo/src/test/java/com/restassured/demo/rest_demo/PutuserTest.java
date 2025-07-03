package com.restassured.demo.rest_demo;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import org.testng.annotations.Test;



public class PutuserTest {

   
    @Test
    public void test() {
        RestAssured.useRelaxedHTTPSValidation();
        RestAssured.baseURI = "https://dummy.restapiexample.com/api/v1/employees";

     Response response = RestAssured 
                    .given()
                    .when()
                    .get()
                    .then()
                    .statusCode(200)
                    .extract().response();

            System.out.println("GET Items Response: " + response.asString());
        }
}

    
   
