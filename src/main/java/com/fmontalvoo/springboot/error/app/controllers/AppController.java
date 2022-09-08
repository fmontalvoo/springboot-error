package com.fmontalvoo.springboot.error.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

	@GetMapping({ "", "/" })
	public String index() {
		@SuppressWarnings("unused")
		Integer i = 1 / 0;
		return "index";
	}

	@GetMapping("/home")
	public String home() {
		return "home";
	}

}
