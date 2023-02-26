package com.cdt.service;

import java.util.List;

import com.cdt.mbg.model.Account;

public interface AccountService {
	
	/**
	 * 透過帳號密碼撈取user
	 * @param userName
	 * @param userPwd
	 * @return
	 */
	public List<Account> getAccount(String userName, String userPwd);
}
