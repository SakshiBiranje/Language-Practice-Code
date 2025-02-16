import java.util.*;
class Helper
{
    static int multiply(int a , int b){
        return a*b; 
    }
    static double multiply(double a , double b){
        return a*b;
    }
}
class Polymorphism
{
    public static void main(String[] args) {
        System.out.println(Helper.multiply(2,3));
        System.out.println(Helper.multiply(5.2,3.7));
    }
}