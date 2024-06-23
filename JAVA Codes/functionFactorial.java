import java.util.*;

public class functionFactorial{
    public static void calculateFactorial(int n){

        if(n<0){
            System.out.println("Invalid");
        }
        int factorial = 1;
        for(int i=n ;i>=1; i--){
            factorial = factorial*i;
        }
        System.out.println("Factrial is "+factorial);
        return;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number :");
        int n =sc.nextInt();
        calculateFactorial(n);
    }
}