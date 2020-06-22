package com.sst.alpha.RealTimeDashboard.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class CashFundHomeController {
	@GetMapping("/home")
	public String home(Model model) {
		return "home";
	}
	
	@PostMapping("/updateCash")
	public String processForm(String cash) {

	    return "showMessage";
	}
}
