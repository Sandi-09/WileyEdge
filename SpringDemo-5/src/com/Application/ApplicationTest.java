package com.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.anno.beans.Customer;

public class ApplicationTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Customer c=(Customer)context.getBean("customer");
		System.out.println("Customer retrived!!");
	}
}