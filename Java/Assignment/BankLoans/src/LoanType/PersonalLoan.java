package LoanType;

 interface Taxable{
    double GetTax();
}
public class PersonalLoan implements Loan, Taxable
{
    int t;
    int p;
    public PersonalLoan(int p,int t) {
        this.p = p;
        this.t = t;
    }

    public float GetRate()
    {
        if (p <= 500000)
        {
            return 0.15f; // 15%
        }
        else
        {
            return 0.16f; // 16%
        }
    }
    public double GetEMI()
    {
        return p * (1 + GetRate() * t / 100) / (12 * t);
    }
    public double GetTax()
    {
        double emi = GetEMI();
        return emi * 0.10;
    }
}


