package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext contect = new ClassPathXmlApplicationContext( "springconfig.xml");
        // System.out.println( "Hello World!" );
        // Student student = new Student();
         //student.show();
    }
}
