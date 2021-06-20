package com.thaiitwork.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class HomeController {
	@Value("${spring.application.name}")
	String appName;

	@GetMapping("/")
	public String showHome(Model model) {
		log.debug("ok");
		model.addAttribute("appName", appName);
		return "home";
	}
}
