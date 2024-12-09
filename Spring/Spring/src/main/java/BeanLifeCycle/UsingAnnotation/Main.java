package BeanLifeCycle.UsingAnnotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("config7.xml");
        Student2 s2=(Student2) context.getBean("std3");
        System.out.println(s2);
        context.registerShutdownHook();
    }
}
