using System;
namespace Main;
using Class;

class Program
{
    static void Main()
    {
        PersonalLoan p1 = new PersonalLoan(1500000, 5);
        HomeLoan hl = new HomeLoan(2500000, 3);
        Loan p2 = new PersonalLoan(1500000, 5);
        Loan h2 = new HomeLoan(2500000, 3);

        Console.WriteLine("EMI for Personal Loan: " + p1.GetEMI());
        Console.WriteLine("EMI for Home Loan: " + hl.GetEMI());
        Console.WriteLine("EMI for Personal Loan: " + p2.GetEMI());
        Console.WriteLine("EMI for Home Loan: " + h2.GetEMI());
    }
}

