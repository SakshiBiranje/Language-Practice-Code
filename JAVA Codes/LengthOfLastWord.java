import java.util.*;
import java.util.Scanner;

class LengthOfLastWord{
    public int lastWordLength(String s){
        int i=s.length()-1;
        while(i>=0 && s.charAt(i) ==' '){
            --i;
        }
        int j=i;
        while(j>=0 && s.charAt(j) != ' '){
            --j;
        }
        return i-j;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your sentence :");
        String sen = sc.nextLine();

        LengthOfLastWord obj = new LengthOfLastWord();
        int lastWord= obj.lastWordLength(sen); 
        System.out.println("Length of last word : "+lastWord);

    }

}