import java.util.*;

public class Map1 {
    public static void main(String[] args) {
        Map<String,Integer> i=new HashMap<>();
        i.put("Sushant",1);
        i.put("Rutu",2);
        i.put("rutu",2);
        i.put("devis",4);

        System.out.println(" "+i);
    }
}
