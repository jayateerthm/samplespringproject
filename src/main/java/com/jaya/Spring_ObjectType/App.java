package com.jaya.Spring_ObjectType;

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
        System.out.println( "Hello World!" );
        String files[]=new String[]{"resources/car.xml","resources/engine.xml"};
        ApplicationContext context=new ClassPathXmlApplicationContext(files);
        Car car=(Car) context.getBean("c");
        car.printData();
        
    }
}
