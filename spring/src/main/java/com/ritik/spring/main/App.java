package com.ritik.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ritik.spring.person.Person;

public class App 
{
    public static void main( String[] args )
    {
//    	retrieving using FileSystemXmlApplicationContext
//        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/com/ritik/spring/person/beans.xml");
        
//    	retrieving using ClassPathXmlApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("com/ritik/spring/person/beans.xml");
        
        
        
        //getting an object by bean id
        Person person = (Person) context.getBean("person");
        person.speak();
        
        //getting an object by type
        Person person1 = context.getBean(Person.class);
        person1.speak();
        
        //returns total number of beans defined
        System.out.println(context.getBeanDefinitionCount());
        
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for(String name : beanDefinitionNames) {
        	System.out.print(name+", ");
        }
        
//        cast it to abstract class AbstractApplicationContext to call close method independent of child class
        ((AbstractApplicationContext)context).close();
        
    }
}
