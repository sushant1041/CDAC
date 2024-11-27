package Circular_Linked_List;

import java.util.Scanner;

public class Main
{
    public static void main(String args[]) {
        Circular_Linked_List obj = new Circular_Linked_List();
        Scanner in = new Scanner(System.in);
        int ch, e;
        obj.create_List();//creating LinkedList
        do {
            System.out.println("\n1.Insert Left\n2.Insert Right\n3.Delete Left:\n4.Delete right\n5.Print \n6.Delete \n7.InsertAfter \n0.Exit :");
            ch = in.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter element:");
                    e = in.nextInt();
                    obj.insert_left(e);
                    System.out.println("Element Inserted");
                    break;

                case 2:
                    System.out.println("Enter element:");
                    e = in.nextInt();
                    obj.insert_right(e);
                    System.out.println("Element Inserted");
                    break;

                case 3:
                    obj.delete_left();
                    break;

                case 4:
                    obj.delete_right();
                    break;
                case 5:
                    obj.print_list();
                    break;
//                case 6:
//                    System.out.println("Enter num to delete");
//                    int num=in.nextInt();
//                    obj.delete_element(num);
//                    break;
//                case 7:
//                    System.out.println("insert two values 1st is ref another num");
//                    int ref= in.nextInt();
//                    int num1=in.nextInt();
//
//                    obj.insert_after(ref,num1);
//                    break;
                case 0:
                    System.out.println("Exiting....");
                    break;

                default:
                    System.out.println("Wrong option selected");
                    break;
            }

        } while (ch != 0);
    }
}