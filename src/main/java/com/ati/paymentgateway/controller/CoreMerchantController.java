package com.ati.paymentgateway.controller;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHeader;
import org.apache.http.protocol.HTTP;
import org.apache.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ati.paymentgateway.model.Merchant;
import com.ati.paymentgateway.service.MerchantService;

@Controller
@RequestMapping("core/merchant")
public class CoreMerchantController extends BaseFormController{
	@Autowired 
	private MerchantService merchantService;
	private static final Logger logger = Logger.getLogger(CoreMerchantController.class);

	@RequestMapping(value= "")
	public String listMerchant(Model model) throws Exception{
		List<Merchant> list = merchantService.getAllMerchant();
		model.addAttribute("merchat", list);
		if (logger.isDebugEnabled()){
			logger.debug(list);
		}
		return "merchant/list";
	}
	
	@RequestMapping(value= "/detail/{id}", method = RequestMethod.GET)
	public String detailMerchant(Model model,@PathVariable(value = "id") Long id) throws Exception{
		Merchant merchant= merchantService.getMerchant(id);
		model.addAttribute("merchant", merchant);
		if (logger.isDebugEnabled()){
			logger.debug("get : "+merchant);
		}
		return "merchant/detail";
	}
	

	@RequestMapping(value="/add", method = RequestMethod.GET)
	public String addMerchant(Model model ) throws Exception{
		Merchant merchant= new Merchant();
		model.addAttribute("merchant", merchant);
		if (logger.isDebugEnabled()){
			logger.debug("get : "+merchant);
		}
		return "merchant/add";
	}

	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String addmer(Model model, @Validated Merchant merchant, BindingResult errors,
			HttpServletRequest request,HttpServletResponse response) {
		if (request.getParameter("cancel") != null) {
			return "redirect:/core/merchant";
		}
		if (errors.hasErrors()){
			model.addAttribute("merchant", merchant);
			saveError(request, getText("something wrong", merchant.getMerchantName(), request.getLocale()));
			logger.error(merchant);
			return "merchant/add";
		}
		merchantService.insertMerchant(merchant);
		saveMessage(request, getText("success save", merchant.getMerchantName(), request.getLocale()));
		if (logger.isDebugEnabled()){
			logger.debug("insert : "+merchant);
		}
		return "redirect:/core/merchant";
	}
	
	@RequestMapping(value="/delete/{id}", method = RequestMethod.GET)
	public String deleteMerchant(Model model,@PathVariable(value = "id") Long id ) throws Exception{
		Merchant merchant= merchantService.getMerchant(id);
		model.addAttribute("merchant", merchant);
		if (logger.isDebugEnabled()){
			logger.debug("get : "+merchant);
		}
		return "merchant/delete";
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.POST)
	public String deleteMerchant2(Model model, @Validated Merchant merchant
			, BindingResult errors,
			HttpServletRequest request,HttpServletResponse response) {		
		if (request.getParameter("cancel") != null) {
			return "redirect:/core/merchant";
		}
		if (errors.hasErrors()){
			Merchant merchant2=  merchantService.getMerchant(merchant.getId());
			model.addAttribute("merchant", merchant2);
			saveError(request, getText("something wrong", merchant.getMerchantName(),
					  request.getLocale()));
			logger.error(errors);
			return "merchant/delete";
		}
		merchantService.deleteMerchant(merchant.getId());
		saveMessage(request, getText("merchant.deleted", merchant.getMerchantName(), 
				request.getLocale()));
		if (logger.isDebugEnabled()){
			logger.debug("delete : "+merchant);
		}
		return "redirect:/core/merchant";
	}
	
	@RequestMapping(value="/edit/{id}", method = RequestMethod.GET)
	public String editMerchant(Model model,@PathVariable(value = "id") Long id ) throws Exception{
		Merchant merchant= merchantService.getMerchant(id);
		model.addAttribute("merchant", merchant);
		if (logger.isDebugEnabled()){
			logger.debug("get : "+merchant);
		}
		return "merchant/edit";
	}
	
	
	@RequestMapping(value="/edit/{id}", method=RequestMethod.POST)
	public String editMerchant2(Model model, @Validated Merchant merchant
			,BindingResult errors,
			HttpServletRequest request,HttpServletResponse response) {		
		if (request.getParameter("cancel") != null) {
			return "redirect:/core/merchant";
		}
		if (errors.hasErrors()){
			Merchant merchant2=  merchantService.getMerchant(merchant.getId());
			model.addAttribute("merchant", merchant2);
			saveError(request, getText("something wrong", merchant.getMerchantName(),
					  request.getLocale()));
			logger.error(errors);
			return "merchant/edit";
		}
		merchantService.updateMerchant(merchant);
		saveMessage(request, getText("merchant.edit", merchant.getMerchantName(), 
				request.getLocale()));
		if (logger.isDebugEnabled()){
			logger.debug("edit : "+merchant);
		}
		return "redirect:/core/merchant";
	}
	
	
	public void postToGWSQcore(){
		JSONObject MG = new JSONObject();
		MG.put("merchantGroupID", 10);
		JSONArray campaignArr = new JSONArray();
		JSONObject campaignInfo = new JSONObject();
//		campaignInfo.put("campaignID", campaign.getId());
		
		campaignInfo.put("campaignID", 15);
		campaignInfo.put("discountType", 1);
		campaignInfo.put("amount", 1);
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-ddTHH:mm");
		
		campaignInfo.put("startDateTime", "2016-07-01T10:00:00");
		campaignInfo.put("endDateTime", "2016-07-02T10:00:00");
		campaignInfo.put("status", false);
		
		JSONArray validationArr = new JSONArray();
		for (int i=0;i<1;i++) {
			JSONObject validationInfo = new JSONObject();
			validationInfo.put("validationID", 1);
			validationInfo.put("field", 1);
			validationInfo.put("valueOperator", 1);
			validationInfo.put("typeData", 1);
			validationInfo.put("dateValue", null);
			validationInfo.put("intValue", 1);
			validationInfo.put("status", true);
			validationArr.add(validationInfo);
		}
        campaignArr.add(campaignInfo);
        campaignInfo.put("validationInfos", validationArr);
        MG.put("campaignInfos", campaignArr);
        
        System.out.println("=======================");
        System.out.println(MG);
        logger.debug("post to qcore");
        logger.debug(MG);
        
        HttpClient httpclient = new DefaultHttpClient();
        InputStream inputStream = null;
        String result = "";
        
        try{
	        // 2. make POST request to the given URL
	        HttpPost httpPost = new HttpPost("10.50.50.68/gws/v0/campaigninformations");
	        
	        String json = "";
	        // 4. convert JSONObject to JSON to String
	        json = MG.toString();
	        
	        System.out.println("json to string : "+json);
	        
	        // 5. set json to StringEntity
	        StringEntity se = new StringEntity(json);
	        se.setContentType(new BasicHeader(HTTP.CONTENT_TYPE, "application/json"));
	        // 6. set httpPost Entity
            httpPost.setEntity(se);
            
            // 7. Set some headers to inform server about the type of the content   
//            httpPost.setHeader("Accept", "application/json");
//            httpPost.setHeader("Content-type", "application/json");

            
         // 8. Execute POST request to the given URL
            HttpResponse httpResponse = httpclient.execute(httpPost);
 
            // 9. receive response as inputStream
            inputStream = httpResponse.getEntity().getContent();
 
            // 10. convert inputstream to string
            if(inputStream != null){
                result = inputStream.toString();
            	System.out.println("result : " +result);
            }
            else{
                result = "Did not work!";
                System.out.println("result : " +result);
            }
        }catch (Exception e){
        	System.out.println("exception : "+e.getLocalizedMessage());
        }
        
	}
}
