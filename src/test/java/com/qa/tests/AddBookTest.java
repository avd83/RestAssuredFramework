package com.qa.tests;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.endpoints.EndPoints;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class AddBookTest {
	
	PoJoPayload pojoPayload = new PoJoPayload();
	@Test(priority=1)
	public void postAddBook() {		
		
		RestAssured.baseURI=EndPoints.addEndpoint;
		Response response = given().log().all().contentType(ContentType.JSON)
			.body(PayloadRequest.requestPayload())
			.when().log().all().post(EndPoints.addResource)
			.then().log().all().assertThat().statusCode(200).extract().response();
		
		Assert.assertEquals(response.statusCode(),200);
	}
	
	@Test(priority=2)
	public void postAddBookFromHashMap() {		
		
		RestAssured.baseURI=EndPoints.addEndpoint;
		Response response = given().log().all().contentType(ContentType.JSON)
			.body(PayloadRequest.requestPayloadFromMap())
			.when().log().all().post(EndPoints.addResource)
			.then().log().all().assertThat().statusCode(200).extract().response();
		
		Assert.assertEquals(response.statusCode(),200);
	}
	
	@Test(priority=3)
	public void postAddBookFromPoJo() {		
		
		RestAssured.baseURI=EndPoints.addEndpoint;
		Response response = given().log().all().contentType(ContentType.JSON)
			.body(PayloadRequest.requestPayloadFromPoJo())
			.when().log().all().post(EndPoints.addResource)
			.then().log().all().assertThat().statusCode(200).extract().response();
		
		Assert.assertEquals(response.statusCode(),200);
	}
	
	
	
	
	
	

}
