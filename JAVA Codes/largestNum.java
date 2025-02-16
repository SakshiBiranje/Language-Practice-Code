import java.util.Scanner;
import java.util.Arrays;
public class largestNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter numbers:");
        for(int i =0;i< n;i++ ){
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Largest Number is "+arr[n-1]);
        
    }
}