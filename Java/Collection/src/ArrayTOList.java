import java.util.*;
import java.io.*;

class Demo
{
    private Demo()
    {
        System.out.println( "Hello");
    }
}
public class ArrayTOList {

    public static void main(String[] args) {
      //  Demo d=new Demo();
        List<Integer> i=new ArrayList<>();
        int arr[]={12,13,53,85,75,45};
        Arrays.sort(arr);
        for(int j=0;j< arr.length;j++)
        {
            i.add(arr[j]);
        }
        Iterator it=i.iterator();
        while(it.hasNext()) //true or false
        {
            System.out.println(" "+it.next());
        }

//        String s3="Value";
//        String s2="Value2";
//        for(int k=0;k<100000;++k){
//            System.out.println(s3=s2+s3);
//        }
    }
}
