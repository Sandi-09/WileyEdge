package com.SpringDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeanTestingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("beans.xml")); 
		//BeanFactory beanFatory=new XmlBeanFactory(new new FileSystemResource("d:\\beans1.xml")); 
		System.out.println("BeanFActory instantiated!!");
	}

}
