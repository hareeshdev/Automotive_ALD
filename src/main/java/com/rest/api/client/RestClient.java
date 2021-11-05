package com.rest.api.client;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RestClient {
//1 Get Method
	
	public void get(String url) throws ClientProtocolException, IOException {
		//1.create one client connection (HttpClients.createDefault();)
		//2.create one closeableHttpclient Abstract class implement by Http client implements by Closeable
		CloseableHttpClient httpclient=HttpClients.createDefault();

				
		HttpGet httpget=new HttpGet(url);//http Get request

		
		
		
		CloseableHttpResponse CloseablehttpResponse=httpclient.execute(httpget);//hit  Get URL
		//status code 200K
		int statuscode=CloseablehttpResponse.getStatusLine().getStatusCode();
		System.out.println("statuscode--->"+statuscode);
		
		
		//To get return  CloseablehttpResponse code any special characters also return
		//JSON String
		// completed String  values convert into Json formate   
		
		String response=EntityUtils.toString(CloseablehttpResponse.getEntity(),"UTF-8");
		JSONObject responsejson=new JSONObject(response);
		System.out.println("responce json from API---->"+responsejson);
		
		//Get All Header's
		// Check Header testing or checking correct Header or coming or not
		
		Header[] headerArray=CloseablehttpResponse.getAllHeaders();
	
		HashMap<String, String> allheaders=new HashMap<String ,String>();
			for(Header header:headerArray) {
				allheaders.put(header.getName(), header.getValue());
		
	}
				System.out.println("Headers Array---->"+allheaders);
	
	}
	
	
}
