using System;

namespace Class
{
    public abstract class Loan
    {
        public double Principle { get; set; }
        public float Period { get; set; }

        public abstract float GetRate();

        public double GetEMI()
        {
            return Principle * (1 + GetRate() * Period / 100) / (12 * Period);
        }
    }
}
