import java.util.*;

public class functionPower
{
    public static int power(int x, int n) {
        int result = 1;
        for(int i=0;i<n;i++){
      result =result*x;   
        System.out.print("Result \n :"+result);  
       // return;   
        }
        return result*x;
    }
    public static void main(String args[]){
        System.out.print("enter x : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print("enter n : ");
        int n = sc.nextInt();
        power(x,n);
    }
}


        