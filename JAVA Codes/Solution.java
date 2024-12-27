import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            long rev = reverseBits(n);
            System.out.println(rev);
        }
        sc.close();
    }

    private static long reverseBits(long n) {
        long result = 0; // Ensure this is a long to accommodate all bits
        for (int i = 0; i < 32; i++) {
            // Shift result left by 1 to make room for the next bit
            result <<= 1;

            // Add the least significant bit of n to result
            result |= (n & 1);

            // Shift n right by 1 to process the next bit
            n >>= 1;
        }
        return result;
    }
}
