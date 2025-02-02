/*
Find the maximum two-digit number present in the given big integer
Ex. I/p: 7649833

Ans. 98
*/

import java.util.Scanner;

public class MaxiTwoDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers without space: ");
        int n = sc.nextInt();
       String s = Integer.toString(n);
       int maxTwoDigit =-1;
       for(int i=0;i<s.length()-1;i++){
        int max = Integer.parseInt(s.substring(i , i+2));
        maxTwoDigit= Math.max(max, maxTwoDigit);
       }
        System.out.println("The maximum two-digit number is: " + maxTwoDigit);

        
    }
}
