package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ThroughContext {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("path.xml");
        Hai hai=(Hai)context.getBean("hi");
        System.out.println(hai);
        Hai ha=(Hai)context.getBean("hii");
        System.out.println(ha);
    }
}
