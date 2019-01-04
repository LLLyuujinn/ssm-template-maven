package com.rip.business.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.rip.business.dao.TestDao;
import com.rip.business.entity.Test;
import com.rip.business.service.TestService;

@Service("testService")
public class TestServiceImpl implements TestService{
	
	@Resource(name = "testDao")
	private TestDao testDao;

	@Override
	public List<Test> test() {
		return testDao.test();
	}


}
