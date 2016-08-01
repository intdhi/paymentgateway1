package com.ati.paymentgateway.header;

import java.nio.charset.Charset;

import org.springframework.http.HttpHeaders;
import org.springframework.security.crypto.codec.Base64;

public class HttpHeader {
	private String token;

	public HttpHeaders createHeaders(final String username, final String password ){
	    HttpHeaders headers =  new HttpHeaders(){
	         {
	             String auth = username + ":" + password;
	             byte[] encodedAuth = Base64.encode(
	                auth.getBytes(Charset.forName("US-ASCII")) );
	             String authHeader = "Basic " + new String( encodedAuth );
	             set( "Authorization", authHeader );
	          }
	       };
//	       headers.add("Content-Type", "application/xml");
//	       headers.add("Accept", "application/xml");
//	       headers.add("X-XSRF-TOKEN", token);
	       return headers;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}	
}