import java.util.*;
import java.util.Scanner;
class FindEvenOdd
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = sc.nextInt();
       
       if(num%2==0 && num>0)
       {
           System.out.print("Even Number");
       }
       else if(num%2!=0 && num>0)
       {
            System.out.print("Odd Number");
       }
       else{
            System.out.print("Invalid option");
       }
    }
}