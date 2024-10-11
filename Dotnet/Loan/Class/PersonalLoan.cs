namespace Class
{
    public interface Taxable{
        double GetTax();
    }
    public class PersonalLoan : Loan, Taxable
    {
       
        public override float GetRate()
        {
            if (Principle <= 500000)
            {
                return 0.15f; // 15%
            }
            else
            {
                return 0.16f; // 16%
            }
        }
        public double GetTax()
        {
            double emi = GetEMI();
            return emi * 0.10; 
        }
    }
}

