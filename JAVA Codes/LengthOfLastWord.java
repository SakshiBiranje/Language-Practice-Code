import java.util.Scanner;

class LengthOfLastWord
{
    public int LastWordLength(String s){
        int i = s.length()-1;
        while(i>=0 && s.charAt(i) == ' '){
            --i;
        }
        int j = i;
        while(j>=0 && s.charAt(j) != ' '){
            --j;
        }
        return i-j;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Sentence : ");
        String sen = scanner.nextLine();

        LengthOfLastWord obj = new LengthOfLastWord();
        int Length = obj.LastWordLength(sen);
        System.out.println("length of lastword : "+Length);

    }

}