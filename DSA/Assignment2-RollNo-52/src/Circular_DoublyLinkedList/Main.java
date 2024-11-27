package Circular_DoublyLinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        CircularDoubly obj = new CircularDoubly();
        Scanner in = new Scanner(System.in);
        int ch, e;
        obj.create_list();

        do {
            System.out.println("\n1.Insert Left\n2.Insert Right\n3.Delete Left\n4.Delete Right\n5.Print\n0.Exit:");
            ch = in.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter element:");
                    e = in.nextInt();
                    obj.insert_left(e);
                    break;

                case 2:
                    System.out.println("Enter element:");
                    e = in.nextInt();
                    obj.insert_right(e);
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

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Wrong option selected");
                    break;
            }

        } while (ch != 0);

        in.close();
    }
}
