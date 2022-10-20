package com.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
//		System.out.println("ApplicationContext Loaded!~");
		
		ApplicationContext applicationContext =new ClassPathXmlApplicationContext("beans.xml","beans1.xml");
		
//		ApplicationContext applicationContext =new ClassPathXmlApplicationContext(
//					new String[] {"beans.xml","beans1.xml"}
//					
//				);
//		
		System.out.println("application context initiated ");
	}

}
