public class Main2 {
    public static void main(String[] args) {
        String input = "a1b2c3"; // Input string
        String result = modifyString(input); // Modify string
        System.out.println(result); // Output the result
    }

    public static String modifyString(String str) {
        StringBuilder modifiedString = new StringBuilder();

        // Iterate through the string
        for (int i = 0; i < str.length(); i++) {
            // Every 3rd character (1-based indexing)
            if ((i + 1) % 3 == 0) {
                // Add previous character multiple times
                char prevChar = str.charAt(i - 1);
                modifiedString.append(String.valueOf(prevChar).repeat(i)); // Repeat the previous character i times
            } else {
                modifiedString.append(str.charAt(i)); // Otherwise, just add the current character
            }
        }

        return modifiedString.toString();
    }
}
