package com.cdt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdt.mbg.mapper.AccountMapper;
import com.cdt.mbg.model.Account;
import com.cdt.mbg.model.AccountExample;
import com.cdt.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountMapper accountMapper;

	@Override
	public List<Account> getAccount(String userName, String userPwd) {
		AccountExample example = new AccountExample();
		example.createCriteria().andIdEqualTo(userName).andPasswordEqualTo(userPwd);
		return accountMapper.selectByExample(example);
	}

}
