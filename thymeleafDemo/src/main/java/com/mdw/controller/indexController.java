package com.mdw.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class indexController {

	@RequestMapping("/user")
	public String getUser() {
		
		return "stupid";
	}
}
