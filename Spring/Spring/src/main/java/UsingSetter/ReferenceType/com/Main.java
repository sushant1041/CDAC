package UsingSetter.ReferenceType.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("config3.xml");
        A a1=(A)context.getBean("aref");
        System.out.println(a1);

    }
}
