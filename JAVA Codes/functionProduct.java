import java.util.*;

public class functionProduct{
    public static int calculateProduct(int a, int b){
        return a * b;
    }
    public static void main(String args[]){
        Scanner scanner= new Scanner (System.in);
        
        System.out.print("Enter a : ");
        int a = scanner.nextInt();
        System.out.print("Enter b : ");
        int b = scanner.nextInt(); 
    
        int product = calculateProduct(a,b);
     System.out.println("Product is "+ product);
    
    }
}