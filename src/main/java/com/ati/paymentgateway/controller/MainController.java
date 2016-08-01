package com.ati.paymentgateway.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
@RequestMapping("/main")
public class MainController extends BaseFormController{
	
	private static final Logger logger = Logger.getLogger(MainController.class);
	
	@RequestMapping(value="",method = RequestMethod.GET)
	public String printHello(ModelMap model) {
		model.addAttribute("successMessages", "Welcome!");
		logger.debug("test.............................");
		return "main";
	}
}
