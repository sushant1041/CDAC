using System;

namespace Patient
{
    class Program
    {
        static void Main(string[] args)
        {
            Patient11 p1 = new Patient11(1, "Anna", 10, 1);
            Console.WriteLine("Total Bill: " + p1.getBillAmount());

            InHouse p2 = new InHouse(1, "Anna", 10, 1); 
            Console.WriteLine("Total Bill After Discount: " + p2.getBillAmount());
        }
    }
}
