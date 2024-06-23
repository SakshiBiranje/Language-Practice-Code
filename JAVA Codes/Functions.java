import java.util.*;

public class Functions  {
    public static int calculateSum(int a , int b)
     {
        return a+b;
    } 

    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);
        int a = scanner.nextInt(); 
        int b = scanner.nextInt();

        int sum = calculateSum(a,b);
        //String name =sc.next();
        System.out.println(sum);
        
    }
}