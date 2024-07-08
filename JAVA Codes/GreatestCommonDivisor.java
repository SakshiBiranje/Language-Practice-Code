import java.util.*;

public class GreatestCommonDivisor {
    public static void divisor(int n1 , int n2) { 
    while(n1 != n2){
        if(n1>n2){
            n1 = n1 - n2;   
        } 
        else {
            n2 = n2 - n1;
        }
    }
    System.out.println("GCD is : "+n2); 
    }
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt(); 
        divisor(n1,n2);
    }
}