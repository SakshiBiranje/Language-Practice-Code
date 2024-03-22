#include<stdio.h>

int main()
{
    int num;
    printf("Enter number :");
    scanf("%d",&num);
    if(num>0) 
    {
        printf("\nPositive Number");
    }
    else if(num < 0)
     {
        printf("\nNegative Number");
    }
    else
    {
        printf("Invalid option");
    }
}
