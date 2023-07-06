package com.BikkadIT.SpringMvcSwcondApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GoodEveningController {

	@GetMapping("/GoodEveningmsg")
	public String GeMessage(Model model) {
		
		String GeMSG="Good Evening All";
		model.addAttribute("MSG", GeMSG);
		return "Evening";
		
	}
}
