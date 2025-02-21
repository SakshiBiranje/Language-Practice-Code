import java.util.*;

// break statement in labeled blocks
public class BreakLabel {
    public static void main(String[] args) {
        boolean t = true;
        // first label
        first: {
            second: {
                third: {
                    System.out.println("Before break statement");

                    if (t) {
                        break second;  // Exits the second label block
                    }

                    System.out.println("This won't execute.");
                }
                System.out.println("This won't execute.");
            }
            System.out.println("After second block.");
        }
    }
}
/* S Notes : 
In Loops: The break statement is used to exit a loop early.
In Switch Cases: It exits the switch block after executing a case.
In Labeled Blocks: It can be used to exit nested blocks of code, providing structured
control flow without using unstructured goto. 
*/