import java.util.*;

class DoWhile1{
    public static void main(String[] args)
    {
        int c=1;
        do {
            System.out.println("Hello !!");
            c++;
        }
        
        // here while condition is false still there will be 1 iteration 
        // so it will print o/p for 1 time...
        while(c>=3);
    }
}