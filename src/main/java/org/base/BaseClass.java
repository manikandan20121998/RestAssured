package org.base;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import io.restassured.response.Response;

public class BaseClass {

  public static int getResponseCode(Response res) {

	return res.getStatusCode();
 }
	public static String getResponseBody(Response res) {

		return res.getBody().asString();
	}
	
	public static String getvaluefromjson(String body,String key) throws ParseException {

		JSONParser j=new JSONParser();
		Object object = j.parse(body);
		
		JSONObject jo=(JSONObject)object;
		Object oi = jo.get(key);
		return oi.toString();
	}
	
	
}
