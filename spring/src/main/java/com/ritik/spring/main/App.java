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
    	
//    	retrieving using ClassPathXmlApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("com/ritik/spring/person/beans.xml");
        
        
        
        //getting an object by bean id
        Person person1 = (Person) context.getBean("person1");
        System.out.println(person1);
       

        
//        cast it to abstract class AbstractApplicationContext to call close method independent of child class
        ((AbstractApplicationContext)context).close();
        
    }
}
