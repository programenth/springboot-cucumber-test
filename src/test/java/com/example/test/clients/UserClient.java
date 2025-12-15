package com.example.test.clients;

import org.springframework.stereotype.Component;

import com.example.test.payloads.CreateUserRequest;

import io.restassured.response.Response;

@Component
public class UserClient extends BaseClient {

    public Response createUser(CreateUserRequest request) {
        return spec()
          .body(request)
          .post("/users");
    }

    public Response getUser(String id) {
        return spec()
          .get("/users/" + id);
    }
}

