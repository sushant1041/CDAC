package patient1;

public class Patient extends Parentall {
    int id, noOfDays, bedtype;
    String patientName;
    double BillAmount = 0;

    public Patient(int id, String patientName, int noOfDays, int bedtype) {
        this.id = id;
        this.patientName = patientName;
        this.noOfDays = noOfDays;
        this.bedtype = bedtype;
    }

    @Override
    public double getBillAmount() {
        if (bedtype == 1) {
            BillAmount = noOfDays * 100;
        } else if (bedtype == 2) {
            BillAmount = noOfDays * 200;
        } else if (bedtype == 3) {
            BillAmount = noOfDays * 300;
        } else {
            System.out.println("Invalid Choice");
            return 0;
        }
        System.out.println("The Amount is: " + BillAmount);
        return BillAmount;
    }
}
