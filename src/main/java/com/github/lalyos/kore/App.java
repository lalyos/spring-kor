package com.github.lalyos.kore;

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
        ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/spring/beans.xml");
        GreetingApp app = ctx.getBean(GreetingApp.class);
        app.greetEverybody();
    }
}
