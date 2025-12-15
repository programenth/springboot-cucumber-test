package com.example.test.stepdefs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.test.clients.UserClient;
import com.example.test.payloads.CreateUserRequest;
import com.example.test.utils.ContextStorage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class UserSteps {
    @Autowired
    UserClient userClient;

    @Autowired
    ContextStorage context;

    @When("I create a user with name {string}")
    public void createUser(String name) {
        CreateUserRequest request = new CreateUserRequest(name);
        Response response = userClient.createUser(request);
        context.put("userId", response.jsonPath().getString("id"));
    }

    @Then("the user should be created successfully")
    public void assertUserCreated() {
        String id = context.get("userId");
        Response response = userClient.getUser(id);
        assertEquals(200, response.getStatusCode());
    }
}
