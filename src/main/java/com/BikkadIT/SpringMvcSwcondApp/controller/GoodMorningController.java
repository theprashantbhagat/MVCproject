package com.BikkadIT.SpringMvcSwcondApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GoodMorningController {

	@GetMapping("/GoodMorningMSG")
	public String GmMessage(Model model) {
		
		String GMMSG="Good Morning All";
		model.addAttribute("msg", GMMSG);
		return "GM";
	}
}
