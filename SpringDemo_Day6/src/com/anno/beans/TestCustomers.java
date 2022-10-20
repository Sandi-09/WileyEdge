package com.anno.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCustomers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		CustomerDAO customerDAO=(CustomerDAO)context.getBean("customerDAOJdbcNamedImple");
		
		//int rows=customerDAO.insert(new Customer(102,"John Doe"));
		customerDAO.update(108);
		//customerDAO.insert(new Customer(103,"Jha Kajal"));
//		Customer c=new Customer(104,"Kaivan Shah");
//		//customerDAO.insert(c);
//		customerDAO.update(c.getCustomerId());
		System.out.println("hey im here");
//		if(rows>0)
//			System.out.println("Record inserted successfully");
//		else
//			System.out.println("Record not inserted");
		
	}
	
}
