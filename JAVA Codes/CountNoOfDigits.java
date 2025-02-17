import java.util.*;
//i/o= 12345
// o/p =5 return no of digits

class CountNoOfDigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        
        String n = sc.nextLine();
        int a = n.length();
        System.out.println(a);
    }
}