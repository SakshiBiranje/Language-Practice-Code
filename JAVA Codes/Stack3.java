import java.util.*;
//insert at bottom of stack

class Stack3{
    private static void insertAtBottom(Stack<Integer> s, int data){
       if(s.isEmpty()){
        s.push(data);
        return;
       }
       int top = s.pop();
       insertAtBottom(s,data);
       s.push(top);
    }
    public static void main(String[] args)
    {
        Stack <Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        insertAtBottom(s,5);
        System.out.println(s);
    }
}