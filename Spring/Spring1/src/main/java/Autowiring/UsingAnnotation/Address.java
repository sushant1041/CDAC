package Autowiring.UsingAnnotation;

public class Address {
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

    public Address(int id, String name, String city) {
        Id = id;
        Name = name;
        City = city;
    }

    @Override
    public String toString() {
        return "EMP-{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", City='" + City + '\'' +
                '}';
    }
    public Address() {
    }

}
