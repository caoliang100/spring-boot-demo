package com.imooc.controller;

import com.imooc.pojo.Configuration;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imooc.pojo.IMoocJSONResult;
import com.imooc.pojo.Resource;

@RestController
public class HelloContoller {

	@Autowired
	private Configuration config;

	@Autowired
	private Resource resource;

	@RequestMapping("/hello")
	public Object hello() {
		return "终于试成功了  "+resource.getLanguage()+"       "+config.getMessage();
	}
	
	@RequestMapping("/getResource")
	public IMoocJSONResult getResource() {
		
		Resource bean = new Resource();
		BeanUtils.copyProperties(resource, bean);
		
		return IMoocJSONResult.ok(bean);
	}
	
}
