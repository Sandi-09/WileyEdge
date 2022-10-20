package com.DependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext applicationContext =new ClassPathXmlApplicationContext("EmployeeBean.xml");
		System.out.println("The bean has eastablished");
	
		Employee emp=(Employee)applicationContext.getBean("emp1");
		System.out.println(emp);
		Employee emp2=(Employee)applicationContext.getBean("emp2");
		System.out.println(emp2);
		Employee emp3=(Employee)applicationContext.getBean("empConst1");
		System.out.println(emp3);
	}

}
