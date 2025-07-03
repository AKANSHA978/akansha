package com.restassured.demo.rest_demo;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class PostUserTest {
	

@Test

public void testing(){
	
RestAssured.baseURI= "https://automationexercise.com"	;
given().
contentType(ContentType.JSON).
body("{\"top\":\"tshirt\",\"jeans\":\"jeans\"}").
when().
post("/api/verifyLogin").
then().
statusCode(200).

log().all();

	
	
}


}
	
