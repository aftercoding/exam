package com.zuora.interview.congjun.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.zuora.interview.congjun.bean.GlobalConfig;
import com.zuora.interview.congjun.bean.TestCaseEntity;

/**
 * Tool:Parser a Jason file to a java bean
 * 
 * 
 * @author Congjun
 * */
public class JasonParser {
	private static String pathOfGlobalCfg = "src/main/rescources/globalConfig";
	
	/**
	 * Translate a jason test case to a test entity bean
	 * */
	public static TestCaseEntity getTestCaseEntity(String testCaseName) throws IOException {
		Gson gson = new Gson();		
		TestCaseEntity tce = gson.fromJson(getContent(testCaseName), TestCaseEntity.class);
		return tce;
	}
	
	/**
	 * Translate a global jason configuration to a global config bean
	 * */
	public static GlobalConfig getGlobalConfig() {
		Gson gson = new Gson();		
		GlobalConfig gcfg = null;
		try {
			gcfg = gson.fromJson(getContent(pathOfGlobalCfg), GlobalConfig.class);
			
		} catch (JsonSyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return gcfg;
	}
	
	public static String getContent(String fileName) throws IOException {
		File file = new File(fileName + ".json");
		String content = FileUtils.readFileToString(file,"UTF-8");
		return content;
	}

	public static void main(String[] args) {
		try {
			getTestCaseEntity("testListDeals");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
