package UsingSetter.PrimitiveType.Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
        Student std=(Student) context.getBean("student");
        System.out.println(std);
    }
}