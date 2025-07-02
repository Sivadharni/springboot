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
        ApplicationContext student = new ClassPathXmlApplicationContext("resources.xml");
        Student s = (Student) student.getBean("st");
        s.internshipProgram();
        SpringBoot s1=(SpringBoot) student.getBean("fun");
        s1.hello("hi world");
        System.out.println( "Hello World!" );
    }
}
