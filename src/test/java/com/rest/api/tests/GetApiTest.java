package com.rest.api.tests;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rest.api.client.RestClient;
import com.test.api.bases.TestBase;


public class GetApiTest extends TestBase{
	private  String ServiceUrl;
	private String apiUrl;
	private String url;
TestBase TestBase;
	@BeforeMethod
	public void setUp() throws ClientProtocolException, IOException {
		TestBase=new TestBase();
		 ServiceUrl=properties.getProperty("URL");
		 apiUrl=properties.getProperty("ServiceURL");
	//https://reqres.in/api/users
		 url=ServiceUrl+apiUrl;
		
	}
	@Test
	public void getTest() throws ClientProtocolException, IOException {
		//create Object of rest client 
		
			RestClient restclient=new RestClient();
					restclient.get(url);
			
	}
}
