import java.util.Scanner;

public class FunctionCircumference {
    public static Double circumference(Double r) {
   return 2*3.14*r;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Double r= sc.nextDouble();
        System.out.println(circumference(r));
    }
}