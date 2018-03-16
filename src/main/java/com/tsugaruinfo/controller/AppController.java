package com.tsugaruinfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

	@RequestMapping("/msg")
	public String message() {
		return "showMessage";
	}
}
