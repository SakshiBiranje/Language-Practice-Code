import java.util.Scanner;

public class ReverseBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number : ");
        int n= scanner.nextInt();
        int reversed = reverseBits(n);
        System.out.println(reversed);
        }

  
    private static int reverseBits(int n) {
        int result = 0;

        // Iterate through all 32 bits
        for (int i = 0; i < 32; i++) {
            
            result <<= 1; // Left shift result
            result |= (n & 1); // Add the current LSB
            n >>= 1; // Right shift the number
        }

        return result;
    }
}
