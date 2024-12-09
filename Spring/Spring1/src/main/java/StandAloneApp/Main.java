package StandAloneApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("config2.xml") ;
        Person P2=context.getBean("p2", Person.class);
        System.out.println(P2);
    }
}
