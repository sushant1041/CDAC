import patient1.Inhouse;
import patient1.Patient;
import patient1.Parentall;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.print("Enter Patient ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Patient Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Number of Days: ");
            int noOfDays = scanner.nextInt();
            System.out.print("Enter Bed Type (1, 2, or 3): ");
            int bedtype = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Patient Type (1 for Inhouse, 2 for Regular): ");
            int patientType = scanner.nextInt();

            Parentall patient;

            switch (patientType) {
                case 1:
                    System.out.print("Enter discount percentage: ");
                    double discount = scanner.nextDouble();
                    patient = new Inhouse(new Patient(id, name, noOfDays, bedtype), discount);
                    break;

                case 2:
                    patient = new Patient(id, name, noOfDays, bedtype);
                    break;

                default:
                    System.out.println("Invalid patient type selected.");
                    return;
            }

            double billAmount = patient.getBillAmount();
            System.out.println("Final Bill Amount: " + billAmount);
    }
}
