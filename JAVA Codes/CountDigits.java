import java.util.*;

class CountDigits{
    public static int Digits(int n){
       int count =0;
       int originalNumber = n;
       while(n > 0){
        int digit= n % 10;
        if(digit !=0 && originalNumber % digit == 0){
            count ++;
        }
        n/=10;
       }
       return count;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n= sc.nextInt();
       // int count=(int) (Math.log10(n)+1);
       // System.out.println(count);
       int result= Digits(n);
       System.out.println("Result : "+ result);
       
    }
}