using System;

class Program
{
 static void Main(string[] args)
 {
   Banner b1 = new Banner();
   Console.WriteLine("Price for Standard Banner is :"+b1.price());
   Banner b = new Banner();
   Console.WriteLine("Set Height :");
   int h=int.Parse(Console.ReadLine());
   Console.WriteLine("Set Width :");
   int w=int.Parse(Console.ReadLine());
   b.setHeight(h);
   b.setWidth(w);
   double result=b.price();
   Console.WriteLine("Price for Custom Banner is :"+result);
 }

}