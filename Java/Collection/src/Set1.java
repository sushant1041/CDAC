import java.util.HashSet;
import java.util.*;

public class Set1 {
    public static void main(String[] args) {
        Set<String> s=new HashSet<>();
        s.add("Devin");
        s.add("Riche");
        s.add("John");
        s.add("James");
        s.remove(1);
        Iterator i=s.iterator();
        while(i.hasNext())
        {
            System.out.println(" "+i.next());
        }
    }
}
