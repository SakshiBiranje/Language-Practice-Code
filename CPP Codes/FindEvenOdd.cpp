#include<iostream>

using namespace std;

int main()
{
    int num;
    cout<<"Enter a number : ";
    cin>>num;
    if(num%2==0 && num>0){
        cout<<"\nEven Number";
    }
    else if(num%2!=0 && num >0){
        cout<<"\nOdd Number";
    }
}