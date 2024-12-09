package BeanLifeCycle.usingInterfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("config6.xml");
        Student1 s1=(Student1) context.getBean("std2");
        System.out.println(s1);
        context.registerShutdownHook();
    }
}
