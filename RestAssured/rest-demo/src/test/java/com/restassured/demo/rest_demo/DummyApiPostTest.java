package com.restassured.demo.rest_demo;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DummyApiPostTest {

    @Test
    public void testCreateEmployee() {
        // Set base URI
        RestAssured.baseURI = "https://dummy.restapiexample.com/api/v1";

        // Request Body
        String requestBody = "{\n" +
                "  \"name\": \"Akansha\",\n" +
                "  \"salary\": \"100000\",\n" +
                "  \"age\": \"23\"\n" +
                "}";

        // Send POST request
        Response response = RestAssured
                .given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post("/create");

        // Print full response
        System.out.println("Response:\n" + response.asPrettyString());

        // Assertions
        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertEquals(response.jsonPath().getString("status"), "success");
        Assert.assertEquals(response.jsonPath().getString("data.name"), "Akansha");
    }
}
