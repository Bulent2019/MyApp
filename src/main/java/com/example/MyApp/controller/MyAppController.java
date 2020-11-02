package com.example.MyApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyAppController {
	
	@RequestMapping("/")
	public @ResponseBody String myApp() {
		return "Let's Start";
	}
}
