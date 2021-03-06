package com.zhteee.module.service;

import java.util.Map;

import com.zhteee.module.dao.AdminDao;
import com.zhteee.module.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class AdminService {
	
	@Autowired
	private AdminDao adminDao;
	

	public Map<String,Object> login(Admin admin){
		return  adminDao.login(admin);
	}

}