package com.zuora.interview.congjun.exam;

import java.util.Random;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.zuora.interview.congjun.bean.GlobalConfig;
import com.zuora.interview.congjun.bean.TestCaseEntity;
import com.zuora.interview.congjun.utils.JasonParser;

import org.testng.log4testng.Logger;

/**
 *  Encapsulate the Get, Put, Post, Delete functions of Unirest
 * 
 * 
 * @author Congjun
 * */

public class UnirestBase {

	private TestCaseEntity tcE;
	private GlobalConfig gcfg ;		
	public static Logger logger = Logger.getLogger(UnirestBase.class);
	
	public UnirestBase(TestCaseEntity tce) {
		this.tcE = tce;
		if(tce == null)
			logger.error("tce(TestCaseEntity is empty)");
		gcfg = JasonParser.getGlobalConfig();
	}
	
	public  HttpResponse<JsonNode> executeGet() throws UnirestException {
		
		return Unirest.get(tcE.getUrl()).headers(tcE.getHeader())
				.basicAuth(gcfg.getUserName(), gcfg.getPassword()).asJson();		
	}
	
	public  HttpResponse<JsonNode> executePost() throws UnirestException {
		
		return Unirest.post(tcE.getUrl()).basicAuth(gcfg.getUserName(), gcfg.getPassword())
				.headers(tcE.getHeader()).body(tcE.getBody().replaceAll("samson@walt.ltd", String
						.valueOf(Math.abs((new Random()).nextInt())) + "@agilecrm.com")).asJson();
		
		}
	
	public  HttpResponse<JsonNode> executePut() throws UnirestException {
		
		return Unirest.put(tcE.getUrl()).basicAuth(gcfg.getUserName(), gcfg.getPassword())
				.headers(tcE.getHeader()).body(tcE.getBody().replaceAll("samson@walt.ltd", String
						.valueOf(Math.abs((new Random()).nextInt())) + "@agilecrm.com")).asJson();
		
		}
	
	public  HttpResponse<JsonNode> executeDelete() throws UnirestException {
		
		return Unirest.delete(tcE.getUrl()).headers(tcE.getHeader())
				.basicAuth(gcfg.getUserName(), gcfg.getPassword()).asJson();		
	}
	
}


