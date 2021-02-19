package com.src;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class MainClass1 {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext2.xml");		

		PermanantEmployee pe=(PermanantEmployee)context.getBean("pempid");
		System.out.println(pe);
	}

}
