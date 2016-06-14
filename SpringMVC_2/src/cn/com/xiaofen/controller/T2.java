package cn.com.xiaofen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class T2 {

	/**
	 * URL通配符
	 * 		.?	通配一个字符
	 * 			-->"/t_1?"		
	 * 						Y	  	t_1s  
	 * 						N		t_1 t_1ss
	 * 		.*	通配一个字符串(两个‘/’之间进行通配)
	 * 			-->"/t_2*"
	 * 						Y		t_2 t_2sY
	 * 						N		t_2sY/YY
	 * 			
	 * 		.**	通配一个字符串(包含了'/')
	 * 			.一般直接出现在‘/’的后面
	 * 			-->"/t_3/**"
	 * 						Y	t_3  t_3/  t_3/s t_3/s/s t_3/s/
	 * 						N	t_3s
	 * */
	@RequestMapping("/t_1?")
	public String t_1(){
		return "index";
	}
	@RequestMapping("/t_2*")
	public String t_2(){
		return "index";
	}
	@RequestMapping("/t_3/**")
	public String t_3(){
		return "index";
	}
	
	
	/**
	 * REST风格的URI
	 * 	获取某个学生
	 *		GET 	http://localhost/student/201501123
	 *	获取多个学生
	 *		GET 	http://localhost/students
	 * 	添加一个学生
	 * 		POST	http://localhost/student
	 * 	更新一个学生信息
	 * 		POST	http://localhost/student/201501123
	 * 		<input type="hidden" name="_method" value="put"/>
	 * 	删除一个学生信息
	 * 		POST	http://localhost/student/201501123
	 * 		<input type="hidden" name="_method" value="delete"/>
	 * */
	/*
	<!-- 添加对REST风格的URI的支持 -->
	<filter>
		<filter-name>HiddenHttpMethodFilter</filter-name>
		<filter-class>org.springframework.web.filter.HiddenHttpMethodFilter</filter-class>
	</filter>
	<filter-mapping>
		<filter-name>HiddenHttpMethodFilter</filter-name>
		<servlet-name>dispatcher</servlet-name>
	</filter-mapping>
	*/
	
	@RequestMapping(value="/student/{code}",method=RequestMethod.PUT)
	public String get(@PathVariable("code")String code){
		System.out.println(code);
		/*页面的重定向操作*/
		return "redirect:/home.jsp";
	}
}
