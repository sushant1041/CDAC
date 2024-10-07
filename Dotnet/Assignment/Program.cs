using System;

namespace Patient
{
    class Program
    {
        public static double Tax(Patient11 inv)
        {
            double amount=inv.getBillAmount();
            double tax = 0;
            if(amount >= 5000){
               tax = amount * 0.05;
            }
            else if(amount >= 10000)
            {
                tax = amount * 0.10;
            }
            return tax;
        }
        static void Main(string[] args)
        {
            Patient11 p1 = new Patient11(1, "Anna", 30, 1);
            Console.WriteLine("Total Bill: " + p1.getBillAmount());

            InHouse p2 = new InHouse(1, "Anna", 30, 1); 
            Console.WriteLine("Total Bill After Discount: " + p2.getBillAmount());
            Console.WriteLine("Tax is :"+Tax(p1));
        }
    }
}
