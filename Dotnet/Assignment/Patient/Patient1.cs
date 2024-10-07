using System;

namespace Patient
{
    public class Patient11
    {
        int pid;
        string pname;
        int bedType; 
        int noOfDays;

        public double amount;

        public Patient11(int pid, string name, int noOfDays, int bedType)
        {
            this.pid = pid;
            this.pname = name;
            this.noOfDays = noOfDays;
            this.bedType = bedType; 
        }

        // public int bedType{
        //     get { return bedType; }  
        //     set { this.bedType = value; }
        // }

        public virtual double getBillAmount()
        {
            if (bedType == 1)
            {
                amount = noOfDays * 500;
            }
            else if (bedType == 2)
            {
                amount = noOfDays * 350;
            }
            else
            {
                amount = noOfDays * 200;
            }
            return amount;
        }
    }
}
