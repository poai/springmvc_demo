package cn.com.xiaofen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class T2 {

	/**
	 * URLͨ���
	 * 		.?	ͨ��һ���ַ�
	 * 			-->"/t_1?"		
	 * 						Y	  	t_1s  
	 * 						N		t_1 t_1ss
	 * 		.*	ͨ��һ���ַ���(������/��֮�����ͨ��)
	 * 			-->"/t_2*"
	 * 						Y		t_2 t_2sY
	 * 						N		t_2sY/YY
	 * 			
	 * 		.**	ͨ��һ���ַ���(������'/')
	 * 			.һ��ֱ�ӳ����ڡ�/���ĺ���
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
	 * REST����URI
	 * 	��ȡĳ��ѧ��
	 *		GET 	http://localhost/student/201501123
	 *	��ȡ���ѧ��
	 *		GET 	http://localhost/students
	 * 	���һ��ѧ��
	 * 		POST	http://localhost/student
	 * 	����һ��ѧ����Ϣ
	 * 		POST	http://localhost/student/201501123
	 * 		<input type="hidden" name="_method" value="put"/>
	 * 	ɾ��һ��ѧ����Ϣ
	 * 		POST	http://localhost/student/201501123
	 * 		<input type="hidden" name="_method" value="delete"/>
	 * */
	/*
	<!-- ��Ӷ�REST����URI��֧�� -->
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
		/*ҳ����ض������*/
		return "redirect:/home.jsp";
	}
}
