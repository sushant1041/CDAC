package BeanLifeCycle.usingInterfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student1 implements InitializingBean , DisposableBean {
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

    public Student1(int id, String name, String city) {
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
    public Student1() {
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Hello from Destroy Method");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Hello init");
    }
}
