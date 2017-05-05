package com.zfsoft.cloud.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zfsoft.cloud.model.User;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/user") 
public class HelloController {

	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String hello(){
		return "hello , this is helloController";
	}
	
	@ApiOperation(value="获取用户列表", notes="")
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public List<User> list(){
		
		return null;
	}
	
	@ApiOperation(value="添加用户", notes="根据User对象创建用户")
	@ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String add(User user){
		
		return "success";
	}
	
	
	@ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long")
	@ApiOperation(value="查询用户", notes="根据ID查询用户详细信息")
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public User getUserById(@PathVariable Long id){
		
		return null;
	}
	
}
