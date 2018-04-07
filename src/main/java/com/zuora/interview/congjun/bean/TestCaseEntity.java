package com.zuora.interview.congjun.bean;

import java.util.HashMap;
import java.util.Map;

/**
 *  Test Case Entity bean
 * 
 * 
 * @author Congjun
 * */
public class TestCaseEntity {
	private String testCaseName = "";
	private String url = "";

	Map<String, String> header =  new HashMap<String, String>();
	private String body = "";
	
	public TestCaseEntity(String testCaseName) {
		this.testCaseName = testCaseName;
	}
	
	public String getUrl() {
		return this.url;
	}
	
	public Map<String, String> getHeader() {
		return this.header;
	}
	
	public String getBody() {
		return this.body;
	}

	public String getTestCaseName() {
		return testCaseName;
	}

	public void setTestCaseName(String testCaseName) {
		this.testCaseName = testCaseName;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setHeader(Map<String, String> header) {
		this.header = header;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "TestCaseEntity [testCaseName=" + testCaseName + ", url=" + url + ", header=" + header + ", body=" + body
				+ "]";
	}
}
