using System;
namespace Main;
using Class;

class Program
{
    static void Main()
    {
        PersonalLoan p1 = new PersonalLoan();
        p1.Principle = 1500000;
        p1.Period = 5;
        HomeLoan hl = new HomeLoan();
        hl.Principle = 2500000;
        hl.Period = 3;
        Loan p2 = new PersonalLoan();
        p2.Principle = 750000;
        p2.Period = 4;
        Loan h2 = new HomeLoan();
        h2.Principle = 1500000;
        h2.Period = 6;

        Console.WriteLine("EMI for Personal Loan: "+ p1.GetEMI());
        Console.WriteLine("EMI for Home Loan: " + hl.GetEMI());
        Console.WriteLine("EMI for Personal Loan: " + p2.GetEMI());
        Console.WriteLine("EMI for Home Loan: " + h2.GetEMI());
    }
}

