package Ds;

public class Stack1 {
    int tos,maxsize,stack[];

    public void create(int size)
    {
        tos=-1;
        maxsize=size;
        stack=new int[size];
    }
    public void push(int num)
    {
        if(is_Full())
        {
            System.out.println("Stack is full");
        }else{
            stack[++tos]=num;
        }
    }
    public int pop()
    {
        int temp=stack[tos];
        if(is_Empty())
        {
            System.out.println("Stack is Empty");
        }
        else{
            tos--;
        }
        return temp;
    }
    public boolean is_Empty(){
        if(tos==-1)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public boolean is_Full(){
        if(tos==maxsize-1)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public int peek()
    {
        if(is_Empty())
        {
            System.out.println("Stack is empty , You cant peek");
        }
        return stack[tos];
    }
    public void print(){
        if(is_Empty())
        {
            System.out.println("Stack is empty");
        }
        else{
            for(int i=tos;i>-1;i--)
            {
                System.out.println(""+stack[i]);
            }
        }
    }
}

