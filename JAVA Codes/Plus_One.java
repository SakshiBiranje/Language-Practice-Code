import java.util.Scanner;

class Plus_One {
    public int[] PlusOne(int[] digits){
        int n = digits.length;
        for(int i=n-1;i>=0;--i){
            ++digits[i];
            digits[i] %= 10;
            if(digits[i] != 0){
                return digits;
            }
        }
        digits = new int[n+1];
        digits[0]=1;
        return digits;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of digits : ");
        int size = sc.nextInt();
        int[] digits = new int[size];
        System.out.print("Enter the digits: ");
        for(int i=0;i<size;i++){
            digits[i] = sc.nextInt();
        }
        Plus_One obj = new Plus_One();
        int[] result = obj.PlusOne(digits);
        System.out.print("Digits after adding one : ");
        for(int digit : result){
            System.out.print(digit + " ");
        }
        System.out.println();
    }
}