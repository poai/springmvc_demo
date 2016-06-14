package cn.com.xiaofen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/T1")
public class T1 {
	/**
	 * 使用@RequestMapping注解来映射请求的路径
	 * 	.可以出现的类和方法的上面
	 * 	1.value		定义请求的路径
	 * 		.可以配置多个响应的路径	-->value={"/path1","/path2"}
	 * 		.value可以缺省			-->({"/path1","/path2"})
	 * 		.如果只有一个路径		-->
	 *  2.params	定义请求的参数
	 *  	.满足特定的条件			-->params={"name=xiaofen","pass=root"}
	 *  	.同上	
	 *  3.method	定义请求的方式					-->
	 *  	.默认可以响应所有类型的请求
	 *  	.POST请求				-->method=RequestMethod.POST
	 * 	4.headers	定义请求头信息	
	 * 		.当前页面从指定的页面跳转来		-->headers={"Referer=http://localhost:8080/SpringMVC_2/home.jsp"}
	 * 		.同上
	 * */
	@RequestMapping(value="/index",params={"name=xiaofen","pass!=root"})
	public String index(){
		return "index";
	}
	@RequestMapping(value="/index_" ,headers={"Referer=http://localhost:8080/SpringMVC_2/home.jsp"})
	public String index_(){
		return "index";
	}
}
