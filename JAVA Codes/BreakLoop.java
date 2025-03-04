import java.util.*;

class BreakLoop{
    public static void main(String[] args)
    {
        for(int i= 0;i<9;i++ ) {
            if(i==5)
            break;
            System.out.println("Hello " + i);
        }
        System.out.println("Loop completed !!");
    }
}