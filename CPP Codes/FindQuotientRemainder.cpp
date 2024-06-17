#include<iostream>

using namespace std;

int main()
{
    int num1, num2, quotient=0,remainder=0;
    cout<<("Enter two numbers : ");
    cin>>num1>>num2;
    quotient=num1/num2;
    remainder=num1%num2;
    cout<<"Quotient : "<<quotient;
    cout<<"\nRemainder : "<<remainder;
}
