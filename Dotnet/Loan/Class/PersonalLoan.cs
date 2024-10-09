namespace Class
{
    public class PersonalLoan : Loan
    {
        //public PersonalLoan(double principle, float period) : base(principle, period) {}

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
    }
}

