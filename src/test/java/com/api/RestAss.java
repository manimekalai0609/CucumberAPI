package com.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;

public class RestAss {
	
	public Response response;
	
	RequestSpecification given = RestAssured.given();
	
	public void getRequest(String url) {
		
		    //Initialization
		response = given.when().get(url);
	
	}
	
	public void postRequest(String url) {
		
		response = given.when().post(url);
	}
	
	public int getStatus(String url) {
		
//	int code = response.then().extract().statusCode();
		
		response =given.when().get(url);
		int code = response.statusCode();
		ResponseBody body = response.getBody();
      	System.out.println(body.asPrettyString());
		

	return code;
		
	}
	
	public void getBody() {
//		ResponseBody body = response.getBody();
//     	System.out.println(body.asPrettyString());
     	System.out.println("hello");	
	}

}
