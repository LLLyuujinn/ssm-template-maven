package com.rip.business.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.rip.business.service.TestService;

@Controller
@RequestMapping("/testContro")
public class TestContro {
	
	public static final Logger logger = LoggerFactory.getLogger(TestContro.class);
	
	@Resource(name = "testService")
	private TestService testService;
	
	@RequestMapping("/test")
	@ResponseBody
	public JSONArray test() {
		JSONArray array = new JSONArray();
		logger.info("123");
		array.add(testService.test());
		return array;
	}

	@RequestMapping("/test2")
	@ResponseBody
	public JSONArray test2() {
		JSONArray array = new JSONArray();
		logger.info("123");
		array.add(testService.test());
		return array;
	}

}
