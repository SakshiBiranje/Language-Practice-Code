#include<stdio.h>

int main()
{
    int num;

    printf("Enter number :");
    scanf("%d",&num);
    
    if(num%2==0 && num>0)
    {
        printf("\nEven Number");
    }
    else if(num%2!=0 &&num >0)
    {
        printf("\nOdd Number");
    }
    else{
        printf("Inavalid option");
    }
}
