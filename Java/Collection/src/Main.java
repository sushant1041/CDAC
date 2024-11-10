import java.util.Iterator;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> names=new Stack<>();
        names.push("Sushant");
        names.push("Rutu");
        names.push("Gandu");
//        System.out.println(" "+names.get(1));
//        names.pop();
//        System.out.println(" "+names.peek());
        Iterator i= names.iterator();
        while(i.hasNext())
        {
            System.out.println(" "+i.next());
        }
    }
}