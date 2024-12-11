public class ArithmeticoperatorOnString
{
    //arithmetic operators on string
    public static void main (String[] args)
    {
        String num1 = "13";
        String num2 = "25";
        double a1= Integer.parseInt(num1);
        double a2 = Integer.parseInt(num2);
        System.out.println("Addition : "+ (a1+a2));
        System.out.println("division : "+ (a1/a2));
        System.out.println("Modulo : "+ (a1%a2));
        System.out.println("Multiplication : "+ (a1*a2));
    }
}