package cn.com.xiaofen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**标识当前对象为控制器*/
@Controller
public class HelloController {
	/*方法返回值为逻辑视图的名称*/
	@RequestMapping(value="/hello")
	public String hello(){
		System.out.println("hello()");
		return "hello";
	}
	
	@RequestMapping(value="/hello1")
	public String hello1(){
		System.out.println("hello()");
		return "hello";
	}
}
