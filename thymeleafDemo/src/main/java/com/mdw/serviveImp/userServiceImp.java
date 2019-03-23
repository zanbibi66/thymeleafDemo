package com.mdw.serviveImp;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.mdw.service.userService;
import com.mdw.pojo.FormatResult;;


public class userServiceImp implements userService {
	@Autowired
	private FormatResult formatResult; 
	@Override
	public Map<String, String> getUser() {
		
		
		return null;
	}

}
