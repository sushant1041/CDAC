package BeanLifeCycle.UsingAnnotation;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student2 {
    int Id;
    String Name;
    String City;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public Student2(int id, String name, String city) {
        Id = id;
        Name = name;
        City = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", City='" + City + '\'' +
                '}';
    }
    public Student2() {
    }

    @PostConstruct
    public void start()  {
        System.out.println("Hello from init Method");
    }

    @PreDestroy
    public void end(){
        System.out.println("Hello destroy");
    }
}
