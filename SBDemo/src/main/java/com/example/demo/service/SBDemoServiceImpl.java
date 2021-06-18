package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.SBDemoDao;
import com.example.demo.entity.User;

@Service
public class SBDemoServiceImpl implements SBDemoService {

	@Autowired
	private SBDemoDao sbDemoDao;
	
	@Override
	public void saveUser(User user) {
		sbDemoDao.saveUser(user);
	}

}
