package LoanType;

interface Discountable
{
   public double GetDiscount();
}
public class HomeLoan implements Discountable
{
    int p;
    public HomeLoan(int p) {
      this.p=p;
    }

    public float GetRate()
    {
        if (p<= 20000)
        {
            return 0.10f;
        }
        else
        {
            return 0.11f;
        }
    }
    public double GetDiscount()
    {
        double result = p * GetRate() / 100;
        return result * 0.05;
    }
}
