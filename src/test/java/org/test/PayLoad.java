package org.test;

import io.restassured.config.ParamConfig.UpdateStrategy;

public class PayLoad {

	public static String createIssue() {

		String s="{\\r\\n\" + \r\n" + 
				"				\"    \\\"fields\\\": {\\r\\n\" + \r\n" + 
				"				\"        \\\"project\\\": {\\r\\n\" + \r\n" + 
				"				\"            \\\"key\\\": \\\"AZ\\\"\\r\\n\" + \r\n" + 
				"				\"        },\\r\\n\" + \r\n" + 
				"				\"        \\\"summary\\\": \\\"REST ye merry gentlemen.\\\",\\r\\n\" + \r\n" + 
				"				\"        \\\"description\\\": \\\"Creating of an issue using project keys and issue type names using the REST API\\\",\\r\\n\" + \r\n" + 
				"				\"        \\\"issuetype\\\": {\\r\\n\" + \r\n" + 
				"				\"            \\\"name\\\": \\\"Bug\\\"\\r\\n\" + \r\n" + 
				"				\"        }\\r\\n\" + \r\n" + 
				"				\"    }\\r\\n\" + \r\n" + 
				"				\"}";
		return s;
	
	}
  
    public static String UpdateIssue() {
		return "{\r\n" + 
			"    \"fields\": {\r\n" + 
			"        \"summary\": \"updated jira issues\",\r\n" + 
			"        \"description\": \"updated issue description of jira\"\r\n" + 
			"    }\r\n" + 
			"}";

    	
	}

    public static String createuser() {
		return "{\\r\\n\" + \r\n" + 
				"				\"    \\\"name\\\": \\\"morpheus\\\",\\r\\n\" + \r\n" + 
				"				\"    \\\"job\\\": \\\"leader\\\"\\r\\n\" + \r\n" + 
				"				\"}";

		
	}
    
    public static String UpdateUser() {
		return "{\r\n" + 
				"    \"name\": \"Manikandan\",\r\n" + 
				"    \"job\": \"SoftwareTester\"\r\n" + 
				"}";

		
	}
    
    
}
