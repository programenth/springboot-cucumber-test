package com.example.test.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Getter
@Component
public class EnvironmentManager {

    @Value("${base.url}")
    private String baseUrl;

}

