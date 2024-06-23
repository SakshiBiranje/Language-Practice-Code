import java.util.*;

public class functionAvg{
    public static int avg(int a, int b, int c){
        return (a+b+c)/3;
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a : ");
        int a = sc.nextInt();
        System.out.print("enter b : ");
        int b = sc.nextInt(); 
        System.out.print("enter c : ");
        int c = sc.nextInt();
        
        int avg = (a + b+ c)/3;
        System.out.println("Average : "+avg);
       
    }
}

