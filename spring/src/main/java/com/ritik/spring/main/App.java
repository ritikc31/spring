package com.ritik.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ritik.spring.person.Person;
import com.ritik.spring.person.address.Address;
/*
 * this is to demonstrate the p name space
 * we use it to give properties values to a bean 
 * DO NOT use both property element and p name space to specify property of a single bean as it will throw error
 * check beans.xml for more info
 */
public class App {
	public static void main(String[] args) {

//    	retrieving using ClassPathXmlApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ritik/spring/person/beans.xml");

		// getting an object by bean id
		Person person1 = (Person) context.getBean("person1");
		System.out.println(person1);
		
		// getting an object by bean id
		Person person2 = (Person) context.getBean("person2");
		System.out.println(person2);
		
		// get the address2 bean
		Address address2 = (Address) context.getBean("address2");
		System.out.println(address2);

//        cast it to abstract class AbstractApplicationContext to call close method independent of child class
		((AbstractApplicationContext) context).close();

	}
}
