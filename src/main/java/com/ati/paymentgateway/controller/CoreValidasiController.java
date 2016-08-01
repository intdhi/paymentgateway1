package com.ati.paymentgateway.controller;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.codec.Base64;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.ati.paymentgateway.header.HttpHeader;
import com.ati.paymentgateway.model.Merchant;
import com.ati.paymentgateway.model.MessageJson;
import com.ati.paymentgateway.model.Validasi;
import com.ati.paymentgateway.service.ValidasiService;

@Controller
@RequestMapping("core/validasi")
public class CoreValidasiController extends BaseFormController {
	@Autowired 
	private ValidasiService validasiService;
	
	private HttpHeader httpHeader=new HttpHeader();
	
	private static final Logger logger = Logger.getLogger(CoreValidasiController.class);
	
	@RequestMapping(value= "")
	public String listMerchant(Model model) throws Exception{
		List<Validasi> list = validasiService.getAllValidasi();
		model.addAttribute("validasi", list);
		if (logger.isDebugEnabled()){
			logger.debug(list);
		}
		return "validasi/list";
	}
	
/*	private HttpHeaders createHeaders(final String username, final String password ){
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

	       return headers;
	}*/
	
	@RequestMapping(value= "/detail/{id}", method = RequestMethod.GET)
	public String detailValidasi(Model model,@PathVariable(value = "id") Long id) throws Exception{
//		Validasi Validasi= validasiService.getValidasi(id);
		RestTemplate restTemplate = new RestTemplate();
				
	    ResponseEntity<Validasi> response;
	    
	    Validasi validasi;

	    String url = "http://localhost:8081/webservice5/core/validasi/"+id;
//	    response = restTemplate.exchange(url, HttpMethod.GET, new HttpEntity<Object>(header), Validasi.class);
		
	    try{
	    	HttpHeaders header=httpHeader.createHeaders("rest", "rest");

	    	response= restTemplate.exchange(url, HttpMethod.GET, 
	    			new HttpEntity<Validasi>(header), Validasi.class);
			System.out.println("=================================");
			System.out.println("1 \t"+response);
			System.out.println("1.2 \t"+response.getHeaders());
			System.out.println("2 \t"+response.getHeaders().COOKIE);
			System.out.println("2.2 \t"+response.getHeaders().COOKIE.getBytes());
			System.out.println("3 \t"+response.getHeaders().getCacheControl());
			System.out.println("4 \t"+response.getHeaders().WWW_AUTHENTICATE);
			System.out.println("5 \t"+response.getStatusCode());
			System.out.println("6 \t"+response.getClass());
			validasi = response.getBody();
			System.out.println(validasi);
//			httpHeader.setToken(response.)
	    }catch (HttpClientErrorException e){
	    	System.out.println(e.getMessage());
	    }
	    
		
/*		String url2 = "http://localhost:8081/webservice5/core/validasi";
		ResponseEntity<Validasi[]> responseEntity = restTemplate.exchange(url2, HttpMethod.GET, new HttpEntity<Validasi>(createHeaders("rest", "rest")), Validasi[].class);
		Validasi[] objects = responseEntity.getBody();
		MediaType contentType = responseEntity.getHeaders().getContentType();
		HttpStatus statusCode = responseEntity.getStatusCode();
		
		System.out.println("================================");
		System.out.println(objects);
		System.out.println(contentType);
		System.out.println(statusCode);*/
		
//		for (int i=0 ; i< objects.length;i++){
//			System.out.println(objects[i]);
//		}
				
//		System.out.println(validasi);
//		model.addAttribute("validasi", validasi);
//		if (logger.isDebugEnabled()){
//			logger.debug("get : "+validasi);
//		}
		return null;
	}
	
	
	@RequestMapping(value="/add", method = RequestMethod.GET)
	public String addValidasi(Model model ) throws Exception{
		
		Validasi validasi = new Validasi();
		validasi.setNameValidation("cobarest");
		validasi.setValueOperator("=");
		validasi.setDescription("cobarest");
		validasi.setField("cobarest");
		validasi.setTypeData("cobarest");
		validasi.setStringValue("cobarest");
		
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8081/webservice5/core/validasi";		
//		MessageJson result= restTemplate.postForObject(url, validasi, MessageJson.class);
//		System.out.println(result);
		
		HttpEntity<Validasi> httpEntity = new HttpEntity<Validasi>(validasi, 
								(httpHeader.createHeaders("rest", "rest")));
		
		ResponseEntity<MessageJson> message= restTemplate.exchange(url, HttpMethod.POST, 
				httpEntity, MessageJson.class);
		
		System.out.println(message.getBody());
		
		
//		model.addAttribute("validasi", validasi);
//		if (logger.isDebugEnabled()){
//			logger.debug("get : "+validasi);
//		}
		return null;
	}

	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String addValidasiPost(Model model, @Validated Validasi validasi, BindingResult errors,
			HttpServletRequest request,HttpServletResponse response) {
		if (request.getParameter("cancel") != null) {
			return "redirect:/core/validasi";
		}
		
/*		if (errors.hasErrors()){
			model.addAttribute("validasi", validasi);
			saveError(request,getText("something wrong", validasi.getNameValidation(), request.getLocale()));
			logger.error(validasi);
			return "validasi/add";
		}*/
		
		
//		merchantService.insertMerchant(merchant);
		saveMessage(request, getText("success save", validasi.getNameValidation(), request.getLocale()));
		if (logger.isDebugEnabled()){
			logger.debug("insert : "+validasi);
		}
		return "redirect:/core/validasi";
	}
	
}
