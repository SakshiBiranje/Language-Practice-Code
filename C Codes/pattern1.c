#include<stdio.h>


int main()
{
    for(int i=5;i>=1;i--)
    {
        for(int k=5;k>i;k--)
        {
            printf(" ");
        }
        for(int j=0;j<i;j++)
        {
         printf(" * ");
         
        }
        printf("\n");
    }
}