package cn.com.xiafen;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class T {
	public static void main(String[] args) {
		/*
		Hello hello=new Hello();
		hello.setMessage("hello");
		hello.say();
		*/
		/*´´½¨IOCÈÝÆ÷*/
		ClassPathXmlApplicationContext ioc=new ClassPathXmlApplicationContext("beans.xml");
		Hello hello=(Hello) ioc.getBean("hello");
		//hello.setMessage("hello");
		hello.say();
		ioc.close();
	}
}
