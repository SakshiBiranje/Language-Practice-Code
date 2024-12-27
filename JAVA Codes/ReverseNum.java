import java.util.*;

class ReverseNum{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int rev =0;
        while(num > 0){
            //int a = num % 10;
            rev = (rev * 10) + (num%10);
            num = num/10;
        }
        System.out.print("reversed Number : "+ rev);
    }
}