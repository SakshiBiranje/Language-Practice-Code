import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stk.push(c);
            } else if (stk.isEmpty() || !match(stk.peek(), c)) {
                return false;
            } else {
                stk.pop();
            }
        }
        return stk.isEmpty();
    }

    private boolean match(char l, char r) {
        return (l == '(' && r == ')') ||
               (l == '[' && r == ']') ||
               (l == '{' && r == '}');
    }

    public static void main(String[] args) {
        ValidParentheses solution = new ValidParentheses();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter parentheses: ");
        String test = sc.nextLine();

        boolean result = solution.isValid(test);
        System.out.println("Result is: " + (result ? "true" : "false"));
    }
}
