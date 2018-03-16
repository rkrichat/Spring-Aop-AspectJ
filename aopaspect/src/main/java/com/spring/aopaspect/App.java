package com.spring.aopaspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.aopaspect.color.Red;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	Red red = context.getBean(Red.class);
    	red.showColor();
    }
}
