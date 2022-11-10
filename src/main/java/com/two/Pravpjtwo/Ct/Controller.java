package com.two.Pravpjtwo.Ct;


import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class Controller {
	


	@RequestMapping(value = "test", method = RequestMethod.GET)
	public ResponseEntity<?> test(@RequestParam Map<String, String> requestParams) throws Exception {
		
		try {
			Logger log = LogManager.getLogger("Pravpjtwo");
			log.debug("testAPI started: " + requestParams);
			log.info("testAPI started: " + requestParams);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
           return new ResponseEntity<>(requestParams, HttpStatus.OK);
	}
	
	@RequestMapping(value="log",method=RequestMethod.GET)
	public ResponseEntity<?> logs(@RequestParam Map<String,String> obj)
	{
	obj.put("Haii", "Welcome");
	obj.put("To", "TeleApps");
	
	System.err.println(obj);
	
	try
	{
	    Logger log= LogManager.getLogger("Pravpjtwo");
	    log.debug("testapi started" +obj);
	    log.info("testapi started" +obj);
	}
	catch(Exception e)
	{
		System.out.println(e);
		obj.put("Error",e.toString());
	}
	 
	   return new ResponseEntity<>(obj, HttpStatus.OK);
	}
	
}
