package com.cdt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdt.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	@PostMapping("/login")
	public String login() {
		String token = loginService.createToken();
		return token;
	}
}
