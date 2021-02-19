package com.src;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.beans.factory.BeanFactory;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Resource resource=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		
//		Student s=(Student)factory.getBean("stdid");
//		System.out.println(s.getStudentid()+" - "+s.getStudentname()+" -"+s.getStudentmobno());
//	
//      Student s1=(Student)factory.getBean("stdid1");
//		System.out.println(s1.getStudentid()+" - "+s1.getStudentname()+" -"+s1.getStudentmobno());

		Student s2=(Student)factory.getBean("stdid2");
		System.out.println(s2);
		
		Student s3=(Student)factory.getBean("stdid3");
		System.out.println(s3);
	
		//ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml")
		//Student s=(Student)context.getBean("stdid");

		
		Customer c1=(Customer)factory.getBean("cs1");
		System.out.println(c1);
		
		Customer c2=(Customer)factory.getBean("cs2");
		System.out.println(c2);
	}

}
