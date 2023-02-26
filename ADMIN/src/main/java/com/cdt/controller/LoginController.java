package com.cdt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson2.JSONObject;
import com.cdt.mbg.mapper.AccountMapper;
import com.cdt.mbg.model.Account;
import com.cdt.mbg.model.AccountExample;
import com.cdt.service.LoginService;

import io.micrometer.core.instrument.util.StringUtils;

@RestController // 回傳資料 ex: return {"code","1"}
//@Controller	 //導頁面 ex : return "index.html"
@RequestMapping("/admin") // ex: http://localhost:8080/api/login
public class LoginController {

	@Autowired
	private LoginService loginService;

	@Autowired
	AccountMapper accountMapper;

	List<Account> getAccount(String name) {
		AccountExample example = new AccountExample();
		example.createCriteria().andIdEqualTo(name).andPasswordEqualTo(name);
		return accountMapper.selectByExample(example);
	}

	@PostMapping("/login")
	public String login(@RequestBody JSONObject json) {
		// 組一個json 回傳給前端
		JSONObject obj = new JSONObject();
		try {
			String userName = (String) json.get("userName");
			String password = (String) json.get("password");
			String token = loginService.login(userName, password);
			if (StringUtils.isNotBlank(token)) {
				obj.put("code", 200);
				obj.put("message", token);
			}
		} catch (Exception e) {
			obj.put("code", 200);
			obj.put("message", e.getMessage());
		}
		return obj.toString();
	}

}
