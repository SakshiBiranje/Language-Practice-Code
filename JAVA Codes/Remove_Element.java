import java.util.Scanner;

public class Remove_Element
 {
    public int Remove_ele(int[] nums, int v) {
        int k = 0;
        for (int x : nums) {
            if (x != v) {
                nums[k++] = x;
            }
        }
        return k;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter element to remove: ");
        int val = sc.nextInt();

        Remove_Element remover = new Remove_Element();  
        int newLength = remover.Remove_ele(nums, val);

        System.out.println("New length of array: " + newLength);  
        System.out.println("Modified array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");  
        }
        sc.close(); 
    }
}
