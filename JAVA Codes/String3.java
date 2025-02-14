import java.util.Scanner;


// input: a1b3
//output : abbb
public class String3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a ");
        String str= "a1b10";
        for(int i=0;i<str.length();i++) {
            boolean a = str. isDigit(i);
           // int a = str.charAt(i);
            System.out.println(a);

        }
    }
}
