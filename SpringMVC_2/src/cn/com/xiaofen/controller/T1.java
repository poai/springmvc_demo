package cn.com.xiaofen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/T1")
public class T1 {
	/**
	 * ʹ��@RequestMappingע����ӳ�������·��
	 * 	.���Գ��ֵ���ͷ���������
	 * 	1.value		���������·��
	 * 		.�������ö����Ӧ��·��	-->value={"/path1","/path2"}
	 * 		.value����ȱʡ			-->({"/path1","/path2"})
	 * 		.���ֻ��һ��·��		-->
	 *  2.params	��������Ĳ���
	 *  	.�����ض�������			-->params={"name=xiaofen","pass=root"}
	 *  	.ͬ��	
	 *  3.method	��������ķ�ʽ					-->
	 *  	.Ĭ�Ͽ�����Ӧ�������͵�����
	 *  	.POST����				-->method=RequestMethod.POST
	 * 	4.headers	��������ͷ��Ϣ	
	 * 		.��ǰҳ���ָ����ҳ����ת��		-->headers={"Referer=http://localhost:8080/SpringMVC_2/home.jsp"}
	 * 		.ͬ��
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
