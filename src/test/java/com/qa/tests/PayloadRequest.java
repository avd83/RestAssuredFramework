package com.qa.tests;

import java.util.HashMap;
import java.util.Map;

public class PayloadRequest {
	
	static PoJoPayload pojoPayload = new PoJoPayload();
	static Map<String,Object> payload = new HashMap<>();
	public static String requestPayload() {
		
		String request= "{\r\n"
				+ "\"name\":\"Learn Appium Automation with Java\",\r\n"
				+ "\"isbn\":\"bcd\",\r\n"
				+ "\"aisle\":\"227\",\r\n"
				+ "\"author\":\"John foe\"\r\n"
				+ "}\r\n"
				+ "";
		return request;		
	}
	
	public static Map<String, Object> requestPayloadFromMap() {		
		
		payload.put("name", "Learn API Testing");
		payload.put("isbn", "LAT");
		payload.put("aisle", "564");
		payload.put("author", "stefen fleming");
		
		return payload;		
	}
	
public static PoJoPayload requestPayloadFromPoJo() {
	
	pojoPayload.setName("Learn C");
	pojoPayload.setIsbn("ASD");;
	pojoPayload.setAisle("777");
	pojoPayload.setAuthor("torky");
	
	return pojoPayload;
	}
	
	
		
	
	
	
	
	
	
	
	
	
	

}
