namespace Class;
 public interface Discountable{
    double GetDiscount();
 } 
public class HomeLoan : Loan, Discountable
{

    public override float GetRate()
    {
        if (Principle<= 2000000)
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
      double result = Principle * GetRate() / 100;
      return result * 0.05; }
}
