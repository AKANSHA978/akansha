package com.restassured.demo.rest_demo;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class basicget {
	
@org.testng.annotations.Test

public void Test(){
	
		Response response = RestAssured.get("https://automationexercise.com/api/brandsList");
		
		System.out.println("statuscode" +response.getStatusCode());
		System.out.println("Responsebody" +response.getBody());
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
