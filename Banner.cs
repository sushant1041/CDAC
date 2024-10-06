using System;

public class Banner
{
  int height;
  int width;
  public Banner()
  {
   height=36;
   width=32;
  }
  public void setHeight(int h)
  {
   height=h;
  }
  public void setWidth(int w)
  {
   width=w;
  }
  public double price()
  {
   double rate= width * height >= 100 ? 0.80 : 0.95;
   return width * height * rate;
  }

}
