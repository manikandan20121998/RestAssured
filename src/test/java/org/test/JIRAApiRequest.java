package org.test;

import org.base.BaseClass;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class JIRAApiRequest extends BaseClass {
	public static void main(String[] args) {
		//GET
		System.out.println("......GET..........");
		
		RestAssured.baseURI="https://amazooon.atlassian.net/";
		Response res = RestAssured.given().header("Content-Type","application/json").auth().preemptive().basic("manimaddy978@gmail.com", "pt6fBgRdmRCAM8Kv0gQQE966").when().get("rest/api/2/search");
		System.out.println("ResponseCode...."+getResponseCode(res));
		System.out.println("ResponseBody......"+getResponseBody(res));
		
      System.out.println("......GET..........");
		
		RestAssured.baseURI="https://amazooon.atlassian.net/";
		Response res1 = RestAssured.given().header("Content-Type","application/json").auth().preemptive().basic("manimaddy978@gmail.com", "pt6fBgRdmRCAM8Kv0gQQE966")
				.queryParam("jql", "assignee=Manikandan").when().get("rest/api/2/search");
		System.out.println("ResponseCode...."+getResponseCode(res1));
		System.out.println("ResponseBody......"+getResponseBody(res1));
		
		//post
		System.out.println(".....post.......");
		Response post = RestAssured.given().header("Content-Type","application/json").auth().preemptive()
		.basic("manimaddy978@gmail.com", "pt6fBgRdmRCAM8Kv0gQQE966")
		.body(PayLoad.createIssue()).when().post("rest/api/2/issue/");
	
	System.out.println("ResponseCode...."+getResponseCode(post));
	System.out.println("responseBody.....\n"+getResponseBody(post));
	//PUT
	System.out.println(".....put.......");
	Response put = RestAssured.given().header("Content-Type","application/json").auth().preemptive()
	.basic("manimaddy978@gmail.com", "pt6fBgRdmRCAM8Kv0gQQE966")
	.body(PayLoad.UpdateIssue()).when().put("rest/api/2/issue/QA-31");

System.out.println("ResponseCode...."+getResponseCode(put));
System.out.println("responseBody.....\n"+getResponseBody(put));

//delete
System.out.println("........delete.......");
Response delete = RestAssured.given().header("Content-Type","application/json").auth().preemptive()
.basic("manimaddy978@gmail.com", "pt6fBgRdmRCAM8Kv0gQQE966").when().delete("rest/api/2/issue/QA-31");

System.out.println("ResponseCode....."+getResponseCode(delete));
System.out.println("ResponseBody......"+getResponseBody(delete));


	}

}
