import java.util.*;

//Task - 1
//Create an Employee class with employee id, name, age, salary, Using switch case statement, perform the following using Collection Framework
//
//        (1) Add employee
//
//(2) Delete employee (3) Show all employees
//
//(4) Sort all Employees in ascending order of salary.
class Employee {
    public int id;
    public String name;
    public int salary;
    public int age;

    public Employee(int id, String name, int salary, int age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }
    public String toString()
    {
        return "Id: "+this.id+" Name: "+this.name+" Salary: "+this.salary+" Age: "+this.age;
    }

}

public class Task {
   public static List<Employee> employees = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\nEnter Your Choice:");
            System.out.println("1. Add employee");
            System.out.println("2. Delete employee");
            System.out.println("3. Show all employees");
            System.out.println("4. Sort all employees by salary in ascending order");
            System.out.println("5. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    deleteEmployee();
                    break;
                case 3:
                    showAllEmployees();
                    break;
                case 4:
                    sortBySalary();
                    break;
                case 5:
                    System.out.println("Exited Successfully.");
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }
        } while (choice != 5);
    }

    public static void addEmployee() {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        int salary = sc.nextInt();

        System.out.print("Enter Employee Age: ");
        int age = sc.nextInt();

        Employee newEmployee = new Employee(id, name, salary, age);
        employees.add(newEmployee);
        System.out.println("Employee added successfully.");
    }
    public static void deleteEmployee() {
        System.out.println("Enter Employee Id :");
        int search=sc.nextInt();
       boolean result= employees.removeIf(emp -> emp.id == search);
        if(result)
        {
            System.out.println("Deleted Succesfully ");
        }
        else{
            System.out.println("list is empty");
        }
    }

    public static void showAllEmployees() {
        if(employees.isEmpty())
        {
            System.out.println("Sorry Faltu Company No one is working here");
        }
        else{
            Iterator<Employee> i=employees.iterator();
            while(i.hasNext())
            {
                System.out.println(i.next());
            }
        }
    }

    public static void sortBySalary() {
       employees.sort(Comparator.comparing(emp -> emp.salary));
       showAllEmployees();
    }
}
