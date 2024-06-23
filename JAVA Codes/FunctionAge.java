import java.util.Scanner;

public class FunctionAge {
    public static void ageEligible(int a) {
   if(a>18){
    System.out.println("Eligible for voting");
   }
   else{
    System.out.println("Not Eligible for voting");
   }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age : ");
        int a= sc.nextInt();
        ageEligible(a);
    }
}