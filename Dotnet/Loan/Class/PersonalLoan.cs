namespace Class;
public class PersonalLoan : Loan
{
    public PersonalLoan(double p, float t) : base(p, t) {}

    public override float GetRate()
    {
        if (GetPrinciple() <= 500000)
        {
            return 0.15f; // 15%
        }
        else
        {
            return 0.16f; // 16%
        }
    }
}
