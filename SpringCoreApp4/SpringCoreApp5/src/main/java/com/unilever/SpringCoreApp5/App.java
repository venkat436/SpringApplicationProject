package com.unilever.SpringCoreApp5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
        
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Employee.class);
        Employee employee = applicationContext.getBean("employee", Employee.class);
        System.out.println(employee);
        applicationContext.close();
    }
}
