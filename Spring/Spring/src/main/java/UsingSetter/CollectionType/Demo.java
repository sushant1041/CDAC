package UsingSetter.CollectionType;

import java.util.*;

public class Demo {
    String name;
    List<String> phones = new ArrayList<>();
    Set<String> address = new HashSet<>();
    Map<String,String> courses = new HashMap<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public Set<String> getAddress() {
        return address;
    }

    public void setAddress(Set<String> address) {
        this.address = address;
    }

    public Demo() {
    }

    @Override
    public String toString() {
        return "Demo{" +
                "name='" + name + '\'' +
                ", phones=" + phones +
                ", address=" + address +
                ", courses=" + courses +
                '}';
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public Demo(String name, List<String> phones, Set<String> address, Map<String, String> courses) {
        this.name = name;
        this.phones = phones;
        this.address = address;
        this.courses = courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }
}
