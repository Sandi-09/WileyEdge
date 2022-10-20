package com.BeanTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Model.Address;
import com.Model.Employee1;

public class InheritanceTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext =new ClassPathXmlApplicationContext("EmployeeBean1.xml");

		Address emp=(Address)applicationContext.getBean("address1");
		Employee1 emp1=(Employee1)applicationContext.getBean("e2");
		System.out.println(emp.toString());
		emp1.show();
	}

}
