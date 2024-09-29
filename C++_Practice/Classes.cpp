#include<cstdio>

int count=100;
class Employee
{
  
 public:
	 Employee()
	 {
	   /*id=++count;
	   sal=10000;
	   comm=0;
	 */
	 }
	 int getid()
	 {
	 return id;
	 }
         void setid(int z) 
	 {
	   id=z;
	 }
	 void setsal(double x)
	 {
	      sal=x;
	 }
         void setcomm(double y)
	 {
	      comm=y;
	 }
	 double getsal()
	 {
	   return sal;
	 }
	 double getcomm()
	 {
	  return comm;
	 }
  private:
	 int id;
	 double sal;
	 double comm;
};
int main(void)
{
 Employee e1;

double sal;

 e1.setid(101);
 printf("emp emp id%d\n",e1.getid());

 printf("Enter Sal");
 scanf("%lf",&sal);

 e1.setsal(sal);
 printf("emp sal%.2lf\n",e1.getsal());

 e1.setcomm(50);
 printf("emp comm%.2lf\n",e1.getcomm());
 }
