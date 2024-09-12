import java.util.HashMap;
import java.util.Scanner;

public class Roman_To_Int {
    public int romanToInt(String s) {
        // Define a map for Roman numerals and their integer values
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;
        int preValue = 0;

        // Traverse the string
        for (char c : s.toCharArray()) {
            int value = romanMap.get(c);
            if (value > preValue) {
                total += value - 2 * preValue;
            } else {
                total += value;
            }
            preValue = value;
        }

        return total;
    }

    public static void main(String[] args) {
        Roman_To_Int solution = new Roman_To_Int();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Roman numeral: ");
        String romanInput = sc.nextLine();

        int result = solution.romanToInt(romanInput);

        System.out.println("The integer value is: " + result);
    }
}
