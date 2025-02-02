import java.util.Scanner; 
        public class FibboncciSeries { 
        
        public static void main(String[] args) {  
             Scanner scanner = new Scanner(System.in); 
             System.out.print("Enter a number: "); 
             int number = scanner.nextInt(); 
             int first =0;
             int second=1;
             int next;
            for(int i=0;i<= number ; i++){
                System.out.print(first + " ");
                next = first + second;
                first = second;
                second = next;
            }

        }
    }