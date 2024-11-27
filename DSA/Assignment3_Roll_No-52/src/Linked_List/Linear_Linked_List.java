package Linked_List;
public class Linear_Linked_List
{
    Node root;
    public void create_List() {
        root = null;
    }
    public void insertRecord(int employeeId, String employeeName, String gender, int salary) {
        Employee emp = new Employee(employeeId, employeeName, gender, salary);
        Node n = new Node(emp);

        if (root == null) {
            root = n;
        } else {
            Node t = root;
            while (t.next != null) {
                t = t.next;
            }
            t.next = n;
        }
        System.out.println("Employee " + employeeName + " inserted.");
    }

    public void deleteRecord(int employeeId) {
        if (root == null) {
            System.out.println("List Empty");
            return;
        }

        Node t = root;
        Node t2 = root;

        while (t != null && t.employee.employeeId != employeeId) {
            t2 = t;
            t = t.next;
        }

        if (t == null) {
            System.out.println("Employee with ID " + employeeId + " not found.");
        } else {
            if (t == root) {
                root = root.next;
            } else if (t.next == null) {
                t2.next = null;
            } else {
                t2.next = t.next;
            }
            System.out.println("Employee with ID " + employeeId + " deleted.");
        }
    }

    public void searchRecord(int employeeId) {
        if (root == null) {
            System.out.println("List Empty");
            return;
        }

        Node t = root;
        while (t != null) {
            if (t.employee.employeeId == employeeId) {
                System.out.println("Employee Found: ");
                System.out.println("ID: " + t.employee.employeeId);
                System.out.println("Name: " + t.employee.employeeName);
                System.out.println("Gender: " + t.employee.gender);
                System.out.println("Salary: " + t.employee.salary);
                return;
            }
            t = t.next;
        }
        System.out.println("Employee with ID " + employeeId + " not found.");
    }
    public void printAllRecords() {
        if (root == null) {
            System.out.println("List Empty");
            return;
        }
        Node t = root;
        while (t != null) {
            System.out.println("Employee ID: " + t.employee.employeeId);
            System.out.println("Name: " + t.employee.employeeName);
            System.out.println("Gender: " + t.employee.gender);
            System.out.println("Salary: " + t.employee.salary);
            System.out.println("------------------------");
            t = t.next;
        }
    }
}