package BeanLifeCycle;

public class Student {
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

    public Student(int id, String name, String city) {
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

    public Student() {
    }
    public void init(){
        System.out.println("Hello from init");
    }
    public void destroy(){
        System.out.println("bye from destroy");
    }
}
