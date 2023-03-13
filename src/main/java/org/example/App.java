package org.example;

import javafx.application.Application;
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
        BeanFactory beanFactory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
        //ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        Hai hai= (Hai) beanFactory.getBean("hai");
        System.out.println(hai);
    }
}
