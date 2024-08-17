import java.util.*;
import java.util.Scanner;
class PositiveNegativeNum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = sc.nextInt();
       
       if( num>0)
       {
           System.out.print("Positive Number");
       }
       else if(num<0)
       {
            System.out.print("Negative Number");
       }
       
    }
}
