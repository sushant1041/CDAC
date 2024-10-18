using System;
namespace tasks;


public interface Demo
{
  void show();

}
public interface Demo1
{
  void Display();
  
}
public abstract class Nana : Demo,Demo1
{
  public void show()
  {
    Console.WriteLine("Child Node");
  }
  public void Display()
  {
    Console.WriteLine("Display demo1");
  }

}

public class Class1 : Nana
{
  public void show1()
  {
    Console.WriteLine("Leaf Node");
  }
}
