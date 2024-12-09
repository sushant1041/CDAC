package UsingConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("config4.xml");
        Demo d=(Demo)context.getBean("constructor");
        System.out.println(d);
    }
}
