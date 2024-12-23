import java.util.*;

class returnKeyword
{
    double SS(double a, double b)
    {
        double avg = 0;
        avg = (a + b) / 2.0;
        return avg;
    }
    
    public static void main(String[] args)
    {
        System.out.println(new returnKeyword().SS(5.5, 6.5));
    }
}