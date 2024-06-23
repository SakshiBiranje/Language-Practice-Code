import java.util.Scanner;

public class FunctionGreaterNum {
    public static void GreaterNum(int a,int b) {
        if(a>b){
            System.out.print(" a is greater ");
        }
        else{
            System.out.print(" b is greater ");
        }
    } 

    public static void main(String[] args) 
    {
        Scanner scanner= new Scanner (System.in);
        
        System.out.print("Enter a : ");
        int a = scanner.nextInt();
        System.out.print("Enter b : ");
        int b = scanner.nextInt(); 
         GreaterNum(a,b);
    }
}