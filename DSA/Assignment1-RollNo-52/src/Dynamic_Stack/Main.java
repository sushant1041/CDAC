package Dynamic_Stack;
import Ds.*;
import Linked_List.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Stack1 s=new Stack1();
        Linear_Linked_List l=new Linear_Linked_List();
        s.create(5);
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            System.out.println("////////////");
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Peek");
            System.out.println("4.Print");
            System.out.println("5.Exit");
            System.out.println("Enter your choice :");
            choice= sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter number");
                    int num = sc.nextInt();
                    s.push(l.insert_left(num));
                    break;
                case 2:
                    System.out.println("Pop Item:"+s.pop());
                    break;
                case 3:
                    System.out.println("Peek :"+s.peek());
                    break;
                case 4:
                    s.print();
                    break;
                case 5:
                    System.out.println("Good work you can leave now");
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }

        }while(choice!=5);
    }
}
