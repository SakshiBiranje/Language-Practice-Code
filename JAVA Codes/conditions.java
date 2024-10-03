import java.util.*;

public class conditions 
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //adult age checker
        int age = sc.nextInt();

        if(age > 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Not Adult");
        }

        //even odd num
        int x =sc.nextInt();
        if(x % 2 == 0) {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
 

        //greater num 
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a == b) {
            System.out.println("Equal");
        }
        else {
            if(a > b) {
            System.out.println("a is greater ");
            }
            else {
                System.out.println("b is greater ");
            }


            //else if
            if(a == b) {
                System.out.println("Equal");
            }
            else if(a > b) {
                System.out.println("a is greater ");
                }
                else {
                    System.out.println("b is greater ");
                }  
                
                int button = sc.nextInt();
                switch(button){
                    case 1: System.out.println("Hello");
                    break;
                    case 2: System.out.println("Namaste");
                    break;
                    case 3: System.out.println("hola");
                    break;
                    default: System.out.println("invalid");

                }
        
        }
    }
}