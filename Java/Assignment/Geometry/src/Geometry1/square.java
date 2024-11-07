package Geometry1;

public class square extends Shape{
    int s;
    public square(int s) {
        this.s=s;
    }
    public void Area()
    {
        int result=s*s;
        System.out.println("Area of Square = "+result);
    }
}
