package com.stepdefinitions;

import java.io.IOException;

import org.testng.Assert;

import com.basetestclass.BaseTest;
import com.genericutility.Authentications;
import com.genericutility.CommonResponse;
import com.genericutility.CreateURL;
import com.genericutility.PayloadConverter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;


public class GitHub {

	public String bearer_token = Authentications.getBearerToken();
	public String request_payloader;
	public Response response ;

	@Given("Provide repository body")
	public void provide_repository_body() throws IOException {
	   request_payloader =  PayloadConverter.generatePayload("RepoData.json");
	}
	@When("send the request using api")
	public void send_the_request_using_api() throws IOException {
	    String endpoints = CreateURL.baseURI("/user/repos");
	    response = BaseTest.postRequest(endpoints,request_payloader,bearer_token);
	    System.out.println(response);
	}
	@Then("check for name and status code")
	public void check_for_name_and_status_code() {
	    String response_body = response.body().asString();
	    System.out.println(response_body);
	    Assert.assertEquals(CommonResponse.getstatuscode(response), 201);
	}



}
