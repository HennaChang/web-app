package com.cdt.service.impl;

import org.springframework.stereotype.Service;

import com.cdt.service.LoginService;
import com.cdt.utils.JwtUtils;

@Service
public class LoginServiceImpl implements LoginService {

	@Override
	public String createToken() {
		// TODO Auto-generated method stub
//		String token = JwtUtils.createToken();
		return "";
	}

}
