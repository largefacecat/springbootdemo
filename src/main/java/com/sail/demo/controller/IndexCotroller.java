package com.sail.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/** 
* @author : zf
* @create_time : 2018年7月9日 下午3:52:39 
* @description :
*/
@RestController
public class IndexCotroller {
	@RequestMapping(value="/")
	public ModelAndView index(){
		ModelAndView mav = new ModelAndView();
		System.out.println("indexController=>index()");
		mav.setViewName("index/index");
		return mav;
	}
}
