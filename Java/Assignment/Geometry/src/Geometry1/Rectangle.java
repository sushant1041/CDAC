package Geometry1;

public class Rectangle extends Shape{
    int l;
    int b;
    public Rectangle(int l, int b) {
        this.l=l;
        this.b=b;
    }
    public void Area() {
        int result=l*b;
        System.out.println("Area of Rectangle :"+result);
    }
}
