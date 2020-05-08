package com.ritik.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ritik.spring.person.Person;

public class App {
	public static void main(String[] args) {
//    	retrieving using FileSystemXmlApplicationContext
//        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/com/ritik/spring/person/beans.xml");

//    	retrieving using ClassPathXmlApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ritik/spring/person/beans.xml");

		// getting an object by bean id
		Person person = (Person) context.getBean("person");
		System.out.println(person);

//        cast it to abstract class AbstractApplicationContext to call close method independent of child class
		((AbstractApplicationContext) context).close();

	}
}
