package com.ritik.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ritik.spring.person.Person;
/*
 * init method is called by spring after complete instanciation of bean
 * destroy method is called by spring before destroying the bean
 * global init and global destroy is defined at beans level 
 */
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
