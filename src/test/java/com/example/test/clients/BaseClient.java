package com.example.test.clients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.test.config.EnvironmentManager;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

@Component
public class BaseClient {

    @Autowired
    private EnvironmentManager env;

    protected RequestSpecification spec() {
        return RestAssured.given().baseUri(env.getBaseUrl()).contentType(ContentType.JSON);
    }
}
