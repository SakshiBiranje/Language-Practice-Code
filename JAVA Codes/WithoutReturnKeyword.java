import java.util.*;

class WithoutReturnKeyword
{
     void demoSum(int a, int b)
        {
            int sum = 0;
            sum = a + b;
            System.out.println(sum);
            // No return statement in this method
        }

        public static void main(String[] args)
        {
            new WithoutReturnKeyword().demoSum(5, 5);
            // Display message on the console for successful
            // execution of the program
            System.out.print(
                "No return keyword is used and program executed successfully");
        }
    }
