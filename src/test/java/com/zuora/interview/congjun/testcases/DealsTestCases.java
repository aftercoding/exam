package com.zuora.interview.congjun.testcases;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.zuora.interview.congjun.bean.TestCaseEntity;
import com.zuora.interview.congjun.exam.UnirestBase;
import com.zuora.interview.congjun.utils.JasonParser;

import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.AfterSuite;

/**
 *  Deals test cases logic module
 * 
 * 
 * @author Congjun
 * */

public class DealsTestCases {
	private final String  suitePath = "src/test/testSuites/testDeals/";
	public static Logger logger = Logger.getLogger(DealsTestCases.class);
	
	public UnirestBase getUnirestIns (String testName) throws IOException {
		TestCaseEntity tce = JasonParser.getTestCaseEntity(suitePath + testName);
		UnirestBase urst = new UnirestBase(tce);
		return urst;
	}
	
    @Test
    public void testListDeals() throws UnirestException, IOException   {
    	HttpResponse<JsonNode> response = getUnirestIns("testListDeals").executeGet();
		if(response == null) {
			logger.error("testListDeals response is null...");
		}
	    Assert.assertEquals(200,response.getStatus());
    }

	@Test
	public void testGetDealByID() throws UnirestException, IOException   {
		HttpResponse<JsonNode> response = getUnirestIns("testGetDealByID").executeGet();
		if(response == null) {
			logger.error("testGetDealByID response is null...");
		}
		Assert.assertEquals(200,response.getStatus());
	}
	
	@Test
	public void testCreateDeal() throws UnirestException, IOException   {
		HttpResponse<JsonNode> response = getUnirestIns("testCreateDeal").executePost();
		if(response == null) {
			logger.error("testCreateDeal response is null...");
		}
		Assert.assertEquals(200,response.getStatus());
	}
	
	@Test
	public void testUpdateDeal() throws UnirestException, IOException   {
		HttpResponse<JsonNode> response = getUnirestIns("testUpdateDeal").executePut();
		if(response == null) {
			logger.error("testUpdateDeal response is null...");
		}
		Assert.assertEquals(200,response.getStatus());
	}	
	
	@Test
	public void testCreateDealToContactUsingEmailID() throws UnirestException, IOException   {
		HttpResponse<JsonNode> response = getUnirestIns("testCreateDealToContactUsingEmailID").executePost();
		if(response == null) {
			logger.error("testCreateDealToContactUsingEmailID response is null...");
		}
		Assert.assertEquals(200,response.getStatus());
	}
	
	@Test
	public void testdeleteDeal() throws UnirestException, IOException   {
		HttpResponse<JsonNode> response = getUnirestIns("testdeleteDeal").executeDelete();
		if(response == null) {
			logger.error("testdeleteDeal response is null...");
		}
		Assert.assertEquals(204,response.getStatus());
	}

	@Test
	public void testBulkDelete() throws UnirestException, IOException   {
		HttpResponse<JsonNode> response = getUnirestIns("testBulkDelete").executePost();
		if(response == null) {
			logger.error("testBulkDelete response is null...");
		}
		Assert.assertEquals(200,response.getStatus());
	}

	@Test
	public void testGetDealsFromDefaultTracGroupByMilestones() throws UnirestException, IOException   {
		HttpResponse<JsonNode> response = getUnirestIns("testGetDealsFromDefaultTracGroupByMilestones").executeGet();
		if(response == null) {
			logger.error("testGetDealsFromDefaultTracGroupByMilestones response is null...");
		}
		Assert.assertEquals(200,response.getStatus());
	}

	@Test
	public void testGetDealsForParticularTrackGroupByMilestone() throws UnirestException, IOException   {
		HttpResponse<JsonNode> response = getUnirestIns("testGetDealsForParticularTrackGroupByMilestone").executeGet();
		if(response == null) {
			logger.error("testGetDealsForParticularTrackGroupByMilestone response is null...");
		}
		Assert.assertEquals(200,response.getStatus());
	}
	
	@Test
	public void testGetDealsForParticularTrack() throws UnirestException, IOException   {
		HttpResponse<JsonNode> response = getUnirestIns("testGetDealsForParticularTrack").executeGet();
		if(response == null) {
			logger.error("testGetDealsForParticularTrack response is null...");
		}
		Assert.assertEquals(200,response.getStatus());
	}
	
	@Test
	public void testGetDealsRelateToSpecificContact() throws UnirestException, IOException   {
		HttpResponse<JsonNode> response = getUnirestIns("testGetDealsRelateToSpecificContact").executeGet();
		if(response == null) {
			logger.error("testGetDealsRelateToSpecificContact response is null...");
		}
		Assert.assertEquals(200,response.getStatus());
	}
	
	@Test
	public void testGetDealsOfCurrentUser() throws UnirestException, IOException   {
		HttpResponse<JsonNode> response = getUnirestIns("testGetDealsOfCurrentUser").executeGet();
		if(response == null) {
			logger.error("testGetDealsOfCurrentUser response is null...");
		}
		Assert.assertEquals(200,response.getStatus());
	}
	
	@Test
	public void testRemoveContactsOfDeal() throws UnirestException, IOException   {
		HttpResponse<JsonNode> response = getUnirestIns("testRemoveContactsOfDeal").executePut();
		if(response == null) {
			logger.error("testRemoveContactsOfDeal response is null...");
		}
		Assert.assertEquals(200,response.getStatus());
	}
	
	@Test
	public void testCreateContacts() throws IOException, UnirestException {
		HttpResponse<JsonNode> response = getUnirestIns("testCreateContact").executePost();
		if(response == null) {
			logger.error("testCreateContacts response is null...");
		}
		Assert.assertEquals(200,response.getStatus());
	}
  
  
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
	  try {
		  // shutdown Unirest
		Unirest.shutdown();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
  

}
