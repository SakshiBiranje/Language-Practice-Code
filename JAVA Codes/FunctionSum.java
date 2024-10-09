import java.util.Scanner;

public class FunctionSum 
{
    public static int calculateSum(int a,int b) {
        return a + b;
    } 

    public static void main(String[] args) 
    {
        Scanner scanner= new Scanner (System.in);
        
        System.out.print("Enter a : ");
        int a = scanner.nextInt();
        System.out.print("Enter b : ");
        int b = scanner.nextInt(); 
    
        int sum = calculateSum(a,b);
     System.out.println("Sum is "+ sum);
    }
}