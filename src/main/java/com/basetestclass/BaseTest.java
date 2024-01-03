package com.basetestclass;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseTest {

	
	public static Response postRequest(String requestUrl,String request_Payload,String bearer_Token)
	{
		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.contentType(ContentType.JSON).header("Authorization","Bearer "+bearer_Token).body(request_Payload);
		Response response = requestSpecification.post(requestUrl);
		return response;		
	}
}
