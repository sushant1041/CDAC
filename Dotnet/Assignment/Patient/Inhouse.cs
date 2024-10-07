using System;

namespace Patient
{
    public class InHouse : Patient11
    {
        int bedType;
        double discount;

        public InHouse(int pid, string name, int noOfDays, int bedType) : base(pid, name, noOfDays, bedType)
        {
            this.bedType = bedType;
        }

        public double Data()
        {
            return base.amount; 
        }

        public override double getBillAmount()
        {
            double totalAmount = base.getBillAmount();

            if (totalAmount >= 5000)
            {
                discount = 0.05; 
                totalAmount -= totalAmount * discount;
            }
            return totalAmount;
        }
    }
}
