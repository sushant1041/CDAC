package UsingSetter.CollectionType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("config1.xml");
        Demo data=(Demo)context.getBean("coll");
        System.out.println(data);
    }
}
