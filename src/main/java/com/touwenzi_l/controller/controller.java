package com.touwenzi_l.controller;

import com.touwenzi_l.pojo.Dog;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class controller {
	
	/**
	 * 1、@controller 控制器（注入服务）
	 * 2、@service 服务（注入dao）用于标注服务层，主要用来进行业务的逻辑处理
	 * 3、@repository（实现dao访问）用于标注数据访问层，也可以说用于标注数据访问组件，即DAO组件.
	 * 4、@component （把普通pojo实例化到spring容器中）
	 * 5、@Resource  （把从容器中找到Dog的这个对象然后注入）
	 */
	@Resource
	private Dog dog;
	
	@RequestMapping("/hello")
	@ResponseBody
	public String Hello(){
		return "hello Springboot"+dog.getName();
	}
}
