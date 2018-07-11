package com.sail.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/** 
* @author : zf
* @create_time : 2018年7月9日 下午3:18:00 
* @description : 登录
*/
@RestController
@RequestMapping(value="/login")
@Api(value = "login")
public class LoginController {

	
	
	@GetMapping(value="/")
	@ApiOperation(value = "测试swagger接口",notes = "测试swagger")
	public String index(){
		return "hello world! springboot";
	}
	
	
	@GetMapping(value="/test")
	@ApiOperation(value = "测试swagger接口",notes = "测试swagger")
	public String test(@ApiParam(name="name",value="用户名称",required=false) @RequestParam(required=false)String name){
		return "welcome to swagger! "+name;
	}
}
