package com.cdt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

	@GetMapping("/Hello")
	public String getHello() {
		return "Hello";
	}

	/**
	 * 過時
	 * 
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST, path = "/test")
	public String test() {
		return "Hello";
	}

	/**
	 * 登入
	 * 
	 * @return
	 */
	@PostMapping("/login")
	public String login() {
		return "Hello";
	}
}
