package com.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions (features = "C:/Users/User/Desktop/RestAssured/Cucumber_Framework_API/src/test/java/com/featurefiles/GitHubRepo.feature",glue = "com.stepdefinitions")
public class TestRunner {

}
