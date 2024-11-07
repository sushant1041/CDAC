package Geometry1;

public class Circle {
     double radius;
     public Circle(double radius) {
         this.radius = radius;
     }
     public void Area()
     {
         double area = Math.PI * radius * radius;
         System.out.println("The area of the circle is " + area);
     }
}
