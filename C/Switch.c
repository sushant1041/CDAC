#include<stdio.h>

int main()
{
   char grade;
   printf("Enter your grade");
   scanf("%c",&grade);
   switch(grade)
    {
     case 'A': 
	      printf("baiiiii khup chan\n");
	      break;
     case 'B':
	      printf("chan\n");
	      break;
     case 'C':
	      printf("dhoka\n");
	      break;
     case 'D':
	      printf("Goligat Dhoka\n");
	      break;
     default:
	      printf("invalid choice\n");
    
    }
}
