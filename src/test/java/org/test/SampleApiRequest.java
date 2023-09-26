package org.test;

import java.io.File;
import java.io.InputStream;
import java.io.Reader;

import org.base.BaseClass;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import groovy.json.JsonParser;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class SampleApiRequest extends BaseClass{
	public static void main(String[] args) throws ParseException {
		
//		RequestSpecification gg = RestAssured.given();
//		gg.header("Content-Type","application/json");
//		Response res = gg.when().get("https://reqres.in/api/users?page=2");
//		
//		int code = res.getStatusCode();
//		System.out.println(code);
//		
//		ResponseBody body = res.getBody();
//		System.out.println(body);
//		String string = body.asString();
//		System.out.println(string);
		
		System.out.println(".......GET..........");
		
		RestAssured.baseURI="https://reqres.in/";
		
		RequestSpecification gg = RestAssured.given();
		gg.header("Content-Type","application/json");
		gg.queryParam("page", "2");
		Response res = gg.when().get("api/users");
		
//		//path param
//		gg.pathParam("page", "2");
//		Response ress = gg.when().get("api/users/{page}");
		
		
		int code = res.getStatusCode();
		System.out.println(code);
		
		ResponseBody body = res.getBody();
		System.out.println(body);
		String st = body.asString();
		System.out.println(st);
		
		JSONParser j=new JSONParser();
		Object object = j.parse(st);
		
		JSONObject jo=(JSONObject)object;
		Object oi = jo.get("page");
		System.out.println(oi);
		//get value from json
		System.out.println(getvaluefromjson(getResponseBody(res), "page"));
	//POST
		System.out.println(".......POST.........");
		 Response post = RestAssured.given().header("Content-Type","application/json")
				 .body(PayLoad.createuser()).when().post("api/users");
		
		
		System.out.println("ResponseCode......."+getResponseCode(post));
		System.out.println("ResponseBody........"+getResponseBody(post));
		
		
		//PUT
		
		System.out.println(".........PUT.........");
		Response put = RestAssured.given().header("Content-Type","application/json")
				.body(PayLoad.UpdateUser()).when().put("api/users/2");
		
		System.out.println("Responsecode......"+getResponseCode(put));
		System.out.println("ResponseBody....."+getResponseBody(put));
		
		//DELETE
		System.out.println(".........Delete.........");
		Response delete = RestAssured.given().header("Content-Type","application/json").when().delete("api/users/2");
		
		System.out.println("ResponseCode......"+getResponseCode(delete));
		System.out.println("ResponseBody......."+getResponseBody(delete));
		
		
		
		
	}

}
