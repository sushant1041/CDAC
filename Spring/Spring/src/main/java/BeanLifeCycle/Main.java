package BeanLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("config5.xml");
        Student s=(Student) context.getBean("std2");
        System.out.println(s);
        context.registerShutdownHook();
    }
}
