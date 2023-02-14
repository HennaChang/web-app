package com.cdt.api.controller;

import java.util.HashMap;

import com.alibaba.fastjson2.JSONObject;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PunchController {
	
	@PostMapping("punchIn")
	public String punchIn(@RequestBody JSONObject rqJson)
	{
		return "";
	}
}
