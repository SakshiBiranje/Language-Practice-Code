import java.io.*;

class ContinueKeyword 
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 10; i++) {
            // Skip condition where i==3
            if (i == 3) 
                continue;
                
            // Exit the loop when i == 7
            if (i == 7) 
                break; 
            System.out.print(i + " ");
        }
    }
}