using System;
using Class;

namespace Main
{
    class Program
    {
        static void Main()
        {
           
            Loan[] loans = new Loan[4];
            loans[0] = new HomeLoan { Principle = 2500000, Period = 3 };
            loans[1] = new PersonalLoan { Principle = 1500000, Period = 5 };
            loans[2] = new PersonalLoan { Principle = 750000, Period = 4 };
            loans[3] = new HomeLoan { Principle = 1500000, Period = 6 };

            // display EMI and Tax for each loan
            foreach (Loan loan in loans)
            {
                Console.WriteLine("EMI for " + loan.GetType().Name + " ₹: " + loan.GetEMI().ToString("F2"));
                if (loan is Taxable taxableLoan)
                {
                    Console.WriteLine("Tax for " + loan.GetType().Name + " ₹: " + taxableLoan.GetTax().ToString("F2"));
                }
                if (loan is Discountable discountableLoan)
                {
                    Console.WriteLine("Discount for " + loan.GetType().Name + " ₹: " + discountableLoan.GetDiscount().ToString("F2"));
                }
            }

           
            double totalDiscount = GetTotalDiscount(loans);
            double totalTax = GetTotalTax(loans);

            Console.WriteLine("Total Discount on Home Loans ₹: " + totalDiscount.ToString("F2"));
            Console.WriteLine("Total Tax on Personal Loans ₹: " + totalTax.ToString("F2"));
        }

        static double GetTotalDiscount(Loan[] loans)
        {
            double totalDiscount = 0;
            foreach (Loan loan in loans)
            {
                if (loan is Discountable discountableLoan)
                {
                    totalDiscount += discountableLoan.GetDiscount();
                }
            }
            return totalDiscount;
        }

        static double GetTotalTax(Loan[] loans)
        {
            double totalTax = 0;
            foreach (Loan loan in loans)
            {
                if (loan is Taxable taxableLoan)
                {
                    totalTax += taxableLoan.GetTax();
                }
            }
            return totalTax;
        }
    }
}
