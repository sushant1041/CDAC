package StandAloneApp;

import java.util.List;
import java.util.Map;

public class Person {
    List<String> City;

    Map<Integer,String> Mapdemo;

    public Person(List<String> city, Map<Integer, String> mapdemo) {
        City = city;
        Mapdemo = mapdemo;
    }

    @Override
    public String toString() {
        return "Person{" +
                "City=" + City +
                "\nMapdemo=" + Mapdemo +
                '}';
    }



    public Map<Integer, String> getMapdemo() {
        return Mapdemo;
    }

    public void setMapdemo(Map<Integer, String> mapdemo) {
        Mapdemo = mapdemo;
    }

    public List<String> getCity() {
        return City;
    }

    public void setCity(List<String> city) {
        City = city;
    }

    public Person() {
    }
}
