namespace Class;
public class HomeLoan : Loan
{
   // public HomeLoan(double p, float t) : base(p, t) {}

    public override float GetRate()
    {
        if (Principle<= 2000000)
        {
            return 0.10f; // 10%
        }
        else
        {
            return 0.11f; // 11%
        }
    }
}
