public class M {
    public static void main(String[] args) {
        String input = "1a3b2c";
        String result = generateStringFromInput(input); 
        System.out.println(result); 
    }

    public static String generateStringFromInput(String input) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
        
            if (Character.isDigit(input.charAt(i))) {
               
                int repeatCount = 0;
                while (i < input.length() && Character.isDigit(input.charAt(i))) {
                    repeatCount = repeatCount * 10 + (input.charAt(i) - '0');
                    i++;
                }
                
                if (i < input.length()) {
                    char ch = input.charAt(i);
                    for (int j = 0; j < repeatCount; j++) {
                        result.append(ch);
                    }
                }
            }
        }
        
        return result.toString();
    }
}
