import java.util.*;
import java.util.Scanner;
class FindQuotientRemainder
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int divisor,dividend;
        System.out.print("Enter dividend : ");
        dividend = sc.nextInt();
        System.out.print("Enter divisor : ");
        divisor= sc.nextInt();
       
        int quotient=dividend / divisor;
        int remainder = dividend % divisor;
        System.out.println("Quotient : "+quotient);
        System.out.println("Remainder: "+remainder);
    }
}
