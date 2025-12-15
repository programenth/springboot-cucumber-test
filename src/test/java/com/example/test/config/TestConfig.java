package com.example.test.config;

import org.springframework.boot.test.context.SpringBootTest;

import com.example.test.DemoApplicationTests;

import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = DemoApplicationTests.class)
public class TestConfig {

}
