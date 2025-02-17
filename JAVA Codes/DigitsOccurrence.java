import java.util.Scanner;

public class DigitsOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        // Input the array elements
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        
        // Input the three numbers to check occurrences
        System.out.println("Enter three numbers to check their occurrences:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Initialize counters
        int countA = 0, countB = 0, countC = 0;

        // Count occurrences
        for (int num : arr) {
            if (num == a) countA++;
            if (num == b) countB++;
            if (num == c) countC++;
        }

        
        System.out.println("Occurrences:");
        System.out.println(a + " -> " + countA + " time(s)");
        System.out.println(b + " -> " + countB + " time(s)");
        System.out.println(c + " -> " + countC + " time(s)");

        sc.close(); 
    }
}
