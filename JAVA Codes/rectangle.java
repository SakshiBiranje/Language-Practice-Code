import java.util.*;
public class rectangle
{
    public static void main(String args[]) {
        Scanner scanner =new Scanner(System.in);
        
        System.out.print("i:");
        int i =scanner.nextInt();
        System.out.print("j:");
        int j =scanner.nextInt();

        for(i=1;i<=4;i++) {
            //inner loops
            for( j=1;j<=5;j++) {
                if(i == 1 || j == 1 || i == n || j == m){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
            System.out.println(); 
        }
      }
    }
}
