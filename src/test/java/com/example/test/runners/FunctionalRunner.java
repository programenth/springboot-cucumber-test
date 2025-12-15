package com.example.test.runners;

import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;

import com.example.test.config.EnvResolver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = "com.example.test", tags = "@functional", plugin = { "pretty" })
@ActiveProfiles(resolver = EnvResolver.class)
public class FunctionalRunner {

}
