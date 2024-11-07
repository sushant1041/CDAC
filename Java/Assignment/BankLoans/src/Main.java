import LoanType.*;
public class Main {
    public static void main(String[] args) {
         HomeLoan h=new HomeLoan(30000);
         PersonalLoan p=new PersonalLoan(30000,10);

         System.out.println(p.GetTax());
         System.out.println(""+h.GetDiscount());
    }
}