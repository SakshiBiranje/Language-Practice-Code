#include <stdio.h>

void fibboncci(int n)
{
    if(n<=0)
    {
        printf("Invalid input");
    }
    int a=0,b=1,next;

    for(int i=0;i<n;i++)
    {
        if(i==0)
        {
            printf("%d\n",a);
            continue;
        }
        
        if(i==1)
        {
            printf("%d\n",b);
            continue;
        }
        next=a+b;
        a=b;
        b=next;
        printf("%d\n",next);
    }
    printf("\n");
}
int main() {
    int s;
    printf("Enter value:");
    scanf("%d",&s);
    fibboncci(s);
    return 0;
}