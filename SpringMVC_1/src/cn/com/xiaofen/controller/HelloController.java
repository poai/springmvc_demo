package cn.com.xiaofen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**��ʶ��ǰ����Ϊ������*/
@Controller
public class HelloController {
	/*��������ֵΪ�߼���ͼ������*/
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
