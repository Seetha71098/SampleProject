package com.src;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Resource resource=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		
		//ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee e=(Employee)factory.getBean("empid1");
        System.out.println(e);		

		Employee e1=(Employee)factory.getBean("emp1");
        System.out.println(e1);		
		
		Employee e2=(Employee)factory.getBean("empid2");
        System.out.println(e2);		
		
	}

}
