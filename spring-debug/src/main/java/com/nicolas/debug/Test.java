package com.nicolas.debug;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
		Person person = (Person) ac.getBean("person");
		System.out.println(person.getUsername());
	}
}
