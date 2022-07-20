package com.step;

import org.junit.Assert;

import com.api.RestAss;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class StepDef extends RestAss {
	
	String base_url="https://reqres.in/api/users";
	
	@Given("get call to {string}")
	public void get_call_to(String url) {
		
		RestAss rs=new RestAss();
		rs.getRequest(base_url);
	   
	}

	@Then("response is {string}")
	public void response_is(String status) {
		
	  RestAss rs=new RestAss();
	  int status2 = rs.getStatus(base_url);
       Assert.assertEquals(200, status2);
		System.out.println(status2);
		rs.getBody();
		
	}

}
