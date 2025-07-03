package com.restassured.demo.rest_demo;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static org.testng.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class CreateClientTest {

    @Test
    public void testCreateClient() {
        // Set Base URI
        RestAssured.baseURI = "https://recpalapp.co.uk";

        // Create JSON body as a map
        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("first_name", "akans");
        requestBody.put("last_name", "test");
        requestBody.put("email", "akans12300@gmail.com");
        requestBody.put("password", "password");
        requestBody.put("confirm_password", "password");
        requestBody.put("address", "india");
        requestBody.put("postcode", 2443);
        requestBody.put("phone_number", "9897654321");

        // Send POST request and extract response
        Response response = RestAssured
            .given()
                .contentType(ContentType.JSON)
                .body(requestBody)
            .when()
                .post("/api/clients")
            .then()
                .statusCode(200)
                .extract()
                .response();

        // Print response body
        System.out.println("Response: " + response.asString());

        // Validate success response
        assertTrue(response.asString().contains("client_name") || response.asString().contains("Client"), 
                   "Client creation response doesn't contain expected fields");
    }
}
