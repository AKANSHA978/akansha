package com.restassured.demo.rest_demo;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class BasicGetTest {

    @Test
    public void simpleGet() {
        Response response = RestAssured.get("https://reqres.in/api/users/2");
        System.out.println("Status Code: " + response.statusCode());
        System.out.println("Response Body:\n" + response.asPrettyString());
    }
}
