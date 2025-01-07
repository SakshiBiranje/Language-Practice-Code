import java.util.*;

//basic program to print stack elements 1 , 2 , 3
public class Stack1{
    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
       System.out.println(s);
    }
}