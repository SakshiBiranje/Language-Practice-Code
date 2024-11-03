import java.util.Scanner;

class RotateString {
    public boolean rotateString(String s, String goal) {
        return s.length() == goal.length() && (s + s).contains(goal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RotateString rotateString = new RotateString();

        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        System.out.print("Enter the goal string: ");
        String goal = sc.nextLine();

        boolean result = rotateString.rotateString(s, goal);
        if (result) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        
        sc.close();
    }
}
