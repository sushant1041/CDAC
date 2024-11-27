package Linked_List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Linear_Linked_List ems = new Linear_Linked_List();
        ems.create_List();

        while (true) {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Insert Employee Record");
            System.out.println("2. Delete Employee Record");
            System.out.println("3. Search Employee Record");
            System.out.println("4. Print All Employee Records");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:

                    System.out.print("Enter Employee ID: ");
                    int empId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Employee Name: ");
                    String empName = sc.nextLine();
                    System.out.print("Enter Employee Gender (Male/Female): ");
                    String gender = sc.next();
                    System.out.print("Enter Employee Salary: ");
                    int salary = sc.nextInt();
                    ems.insertRecord(empId, empName, gender, salary);
                    break;
                case 2:
                    System.out.print("Enter Employee ID to delete: ");
                    int deleteId = sc.nextInt();
                    ems.deleteRecord(deleteId);
                    break;
                case 3:
                    System.out.print("Enter Employee ID to search: ");
                    int searchId = sc.nextInt();
                    ems.searchRecord(searchId);
                    break;
                case 4:
                    ems.printAllRecords();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

    }
}