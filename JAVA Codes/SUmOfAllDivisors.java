import java.util.Scanner;

public class SUmOfAllDivisors {
    public static int sumOfAllDivisors(int n){
        int ans=0;
        for(int i=0; i<= Sqrt(n) ;i++){
            if(n%i==0){
                 ans =i;
            }
        }
       return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt();
        int ans= sumOfAllDivisors(n);
		System.out.println(ans);
    }
}