package com.security.JB_AWT;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
	@GetMapping("/")
	public String home() {
		return "Welcome";

	}
}
