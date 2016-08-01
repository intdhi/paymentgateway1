package com.ati.paymentgateway.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HTTPErrorHandler {

	private static final Logger logger = Logger.getLogger(HTTPErrorHandler.class);

	@RequestMapping(value="/400")
	public String error400(){
		logger.error("error page 400");
		return "/400";
	}

	@RequestMapping(value="/404")
	public String error404(){
		logger.error("error page 404");
		return "/404";
	}

	@RequestMapping(value="/500")
	public String error500(){
		logger.error("error page 500");
		return "/500";
	}
}
