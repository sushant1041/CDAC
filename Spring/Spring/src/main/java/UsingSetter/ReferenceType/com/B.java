package UsingSetter.ReferenceType.com;

public class B {
    String name;
    String city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public B(String name, String city) {
        this.name = name;
        this.city = city;
    }


    public B() {
    }

    @Override
    public String toString() {
        return "B{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
