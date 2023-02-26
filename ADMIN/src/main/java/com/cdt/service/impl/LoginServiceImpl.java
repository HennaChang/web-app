package com.cdt.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdt.mbg.mapper.AccountMapper;
import com.cdt.mbg.model.Account;
import com.cdt.mbg.model.AccountExample;
import com.cdt.service.AccountService;
import com.cdt.service.LoginService;
import com.cdt.utils.JwtUtils;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private AccountService accountService;
	@Autowired
	private AccountMapper accountMapper;

	@Override
	public String login(String userName, String password) {
		String token = "";
		// 驗證DB
		List<Account> account = accountService.getAccount(userName, password);

		if (account != null && account.get(0) != null) {
			// 驗證成功 產生token
			// 呼叫jwtUtil 產生token
			Map<String, String> claims = new HashMap<>();
			claims.put("userName", userName);
			token = JwtUtils.generateToken(claims);
		}
		return token;
	}

}
