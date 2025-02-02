import java.util.Scanner; 
        public class AddWithouttemp { 
        
        public static void main(String[] args) {  
             Scanner scanner = new Scanner(System.in); 
             System.out.print("Enter a number: "); 
             int num1= scanner.nextInt(); 
             System.out.print("Enter a number: "); 
             int num2= scanner.nextInt(); 
             num2 = num1 + num2;
             num1 = num2 - num1;
             num2 =  num2-num1;

             System.out.println(num1);
             System.out.println(num2);
        }
    }