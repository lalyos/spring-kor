package com.github.lalyos.kore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("src/main/resources/META-INF/spring/beans.xml"));
        ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/spring/beans.xml");
        GreetingApp app = ctx.getBean(GreetingApp.class);
        app.greetEverybody();
    }
}
