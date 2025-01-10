import java.util.*;

// i/p = 1 2 3 
// o/p = 3 2 1
//using satck

class Stack2{
    private static void insertAtBottom(Stack<Integer> stack, int data){
        if(stack.isEmpty()){
           stack.push(data);
            return;
        }
        int top = stack.pop();
        insertAtBottom(stack, data);
        stack.push(top);

    }
    
    private static void reverseStack(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
             
        }
        int top = stack.pop();
        reverseStack(stack);
        insertAtBottom(stack,top);
    }
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Before revese :"+stack);
        reverseStack(stack);
        System.out.println("After revese :"+stack);

    }
}
