package com.restassured.demo.rest_demo;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.http.ContentType;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

public class ClientFilterTest {

    @Test
    public void testGetInactiveClients() {
        // Base URI
        RestAssured.baseURI = "https://recpalapp.co.uk";

        // Send GET request and extract the response
        Response response = RestAssured
            .given()
                .queryParam("client[activated]", "false")
                .queryParam("per_page", 10)
            .when()
                .get("/api/client_filter")
            .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .extract()
                .response();

        // Print full response
        String jsonResponse = response.asString();
        System.out.println("Full Response:\n" + jsonResponse);

        // Extract and validate 'data' list
        List<Map<String, Object>> clients = response.jsonPath().getList("data");

        assertNotNull(clients, "Client list is null");
        assertFalse(clients.isEmpty(), "No inactive clients returned");
        assertTrue(clients.size() <= 10, "More than 10 clients returned");

        // Validate that all clients are deactivated
        for (Map<String, Object> client : clients) {
            assertEquals(false, client.get("activated"), "Client is not deactivated");
        }
    }
}
