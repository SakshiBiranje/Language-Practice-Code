import java.util.Scanner;
import java.util.ArrayList;

public class SUmOfAllDivisors {
    public static ArrayList<Integer> sumOfAllDivisors(int n){
       ArrayList<Integer> divisors = new ArrayList<>();
       int sqrtN = (int) Math.sqrt(n);
       for(int i=1;i<=sqrtN;++i){
           if(n%i==0){
               divisors.add(i);
           }
           if(i!=n/i){
               divisors.add(n/i);
           }
       }
       return divisors;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
       
        int num = sc.nextInt();
        ArrayList<Integer> divisors = sumOfAllDivisors(num);
        int sum =0;
        System.out.print("Sum of all divisors of "+ num +" : ");
        for(int divisor :divisors){
            sum += divisor;
        }
        System.out.println(sum);



    }
}
