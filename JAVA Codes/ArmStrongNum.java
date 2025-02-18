import java.util.*;
import java.util.Scanner;
public class ArmStrongNum {
	
	public static boolean armstrong(int n) {
		int dup = n;
        int ab= n/10;
        int c= n%10;
        int b = ab%10;
        int a = ab/10;
        int ans = a*a*a + b*b*b + c*c*c;
        if(dup==ans) {
            return true;
        }
        else{
            return false;
        }  
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        boolean ans= armstrong(n);
		System.out.println(ans);


	}
}
