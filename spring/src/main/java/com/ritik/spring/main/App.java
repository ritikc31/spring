package com.ritik.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ritik.spring.person.Person;

/*
 * after running once change the bean scope to prototype to see difference.
 * spring will return the different object of the bean every time when scope is prototype.
 */
public class App 
{
    public static void main( String[] args )
    {   
//    	retrieving using ClassPathXmlApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("com/ritik/spring/person/beans.xml");
                
		/*
		 * getting an object by bean id 
		 * by default scope is singleton
		 */
        Person person1 = (Person) context.getBean("person");
        System.out.println("Initial state: "+person1);
        
		/* change the name of person1 */
        person1.setName("Eric");
        System.out.println("After changing name :"+person1);
        
		/* get the bean with same id */
        Person person2 = (Person) context.getBean("person");
        System.out.println("person2 :"+person2);
        
        
//        cast it to abstract class AbstractApplicationContext to call close method independent of child class
        ((AbstractApplicationContext)context).close();
        
    }
}
