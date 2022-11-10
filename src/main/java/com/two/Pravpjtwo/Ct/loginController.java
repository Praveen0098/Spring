package com.two.Pravpjtwo.Ct;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.two.Pravpjtwo.Sv.ServiceClass;

@RestController
@RequestMapping("/api/")

public class loginController {
	@Autowired ServiceClass obj;
	
	String Result="";
	@RequestMapping(value="login",method=RequestMethod.GET)
	public ResponseEntity<?> userlogin(@RequestParam Map<String, String> reqPrms)
 {
		String name = reqPrms.get("name");
		String pass = reqPrms.get("password");
		Result=obj.UserLogin(name, pass);
	    
		return new ResponseEntity<>(Result,HttpStatus.OK);
		 
	}
	
}
