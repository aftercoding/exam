package com.zuora.interview.congjun.utils;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.zuora.interview.congjun.bean.TestCaseEntity;

/**
 * Tool:Generate a Jason file for a test case
 * 
 * 
 * @author Congjun
 * */

public class JasonTestCaseGenerator {
	public static void createTestCaseByBean() {
		String urlPrefix = "https://interview.agilecrm.com/dev/api";
		TestCaseEntity tce = new TestCaseEntity("testRemoveContactsOfDeal");
		
		tce.setUrl(urlPrefix + "/opportunity/partial-update/delete-contact");
		Map<String, String> header =  new HashMap<String, String>();
		header.put("Accept", "application/json");	
		header.put("Content-Type", "application/json");
		tce.setHeader(header);
//		tce.setBody("");
		tce.setBody(("{\r\n" + 
				"      \"id\": \"6429943999234048\",\r\n" + 
				"      \"contact_ids\": [\r\n" + 
				"          \"4930210138947584\",\r\n" + 
				"	  \"4600356650614784\"\r\n" + 
				"      ]\r\n" + 
				"  }").replaceAll("\r|\n", ""));
		
		GsonBuilder gsonBuilder = new GsonBuilder();
		gsonBuilder.setPrettyPrinting();		
		Gson gson = gsonBuilder.create();
		System.out.println(gson.toJson(tce));
	}
	public static void main(String [] args) {
		createTestCaseByBean();
	}
}
