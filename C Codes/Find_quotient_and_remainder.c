#include <stdio.h>  

int main()
{
    int a,b,quo=0,rem=0;
    printf("Enter two numbers: ");
    scanf("%d %d",&a ,&b);
    quo=a/b;
    rem=a%b;
    printf("quotient : %d \n",quo);
    printf("remainder : %d",rem);
    return 0;
}