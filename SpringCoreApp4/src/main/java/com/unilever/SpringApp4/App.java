package com.unilever.SpringApp4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		Object employee = applicationContext.getBean("employee", Employee.class);
		System.out.println(employee);
		applicationContext.close();
	}
}
