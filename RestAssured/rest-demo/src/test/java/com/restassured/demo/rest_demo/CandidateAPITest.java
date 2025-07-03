package com.restassured.demo.rest_demo;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.http.ContentType;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Map;

import org.testng.annotations.Test;

public class CandidateAPITest {

    @Test
    public void testGetApprovedActivatedCandidates() {
        // Base URI
        RestAssured.baseURI = "https://recpalapp.co.uk";

        // API Response
        Response response = RestAssured
            .given()
                .queryParam("page", 1)
                .queryParam("per_page", 10)
                .queryParam("status_value", "approved")
                .queryParam("activated_value", "true")
            .when()
                .get("/api/candidates")
            .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .body("data", not(empty())) // check that data array is not empty
                .extract()
                .response();
        
        String jsonResponse = response.asString();
     System.out.println("Full Response:\n" + jsonResponse);

        // Optional: Additional assertions
        int totalCandidates = response.jsonPath().getList("data").size();
        System.out.println("Total candidates returned: " + totalCandidates);
        assertTrue(totalCandidates <= 10, "More than 10 candidates returned");

        // Optional: Validate that all candidates are approved and activated
        response.jsonPath().getList("data").forEach(candidate -> {
            assertEquals("approved", ((Map<?, ?>)candidate).get("status"), "Candidate not approved");
            assertEquals(true, ((Map<?, ?>)candidate).get("activated"), "Candidate not activated");
        });
    }
}
