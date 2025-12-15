package com.example.test.runners;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.example.test.config.EnvResolver;

import io.cucumber.junit.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.example.test",
        tags = "@smoke"
)
@SpringBootTest
@ActiveProfiles(resolver = EnvResolver.class)
public class SmokeRunner {}
