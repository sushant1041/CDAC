package Ds;
import Ds.*;

class Convert{
    String output="";
    Stack s=new Stack();
    public void check(String input)
    {
        System.out.println("Infix String is :"+input);
        s.create(input.length());
        for(int i=0;i<input.length();i++)
        {
            char c= input.charAt(i);
            if(c == '(' || c== '+' || c== '-' || c == '*' || c== '/')
            {
                if(c == '(')
                {

                }
                else{
                    s.push(c);
                }
            }
            else if(c == ')'){
                while(!s.is_Empty()) {
                    output = output + (char)s.pop();
                }
            }
            else{
                output= output + c;
            }
        }
        System.out.println(" PostFix String :"+output);
    }
}
public class InfixToPostfix {
    public static void main(String[] args) {
        Convert c=new Convert();
        String string="(a+b)*(d-c)/(k-m)";
        c.check(string);
    }
}

