package patient1;

public class Inhouse extends Parentall {
    double discount;
    Patient patient;

    public Inhouse(Patient patient, double discount) {
        this.patient = patient;
        this.discount = discount / 100;
    }

    @Override
    public double getBillAmount() {
        double result = patient.getBillAmount();
        return result - (result * discount);
    }
}
