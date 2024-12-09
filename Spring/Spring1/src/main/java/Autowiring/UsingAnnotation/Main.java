package Autowiring.UsingAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("config1.xml");
        Emp e1=(Emp)context.getBean("emp1");
        System.out.println(e1);
    }

//    there are three ways to declare @Autowired annotation
//    1) On Property
//    2) On Setter Method
//    3) On Constructor

}
