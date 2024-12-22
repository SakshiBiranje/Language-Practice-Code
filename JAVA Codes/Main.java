import java.util.Scanner;

class Remove_Element {
    public int removeElement(int[] nums, int val) 
    {
        int k = 0;
        for (int x : nums) {
            if (x != val) {
                nums[k++] = x;
            }
        }
        return k;
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.print("Enter the value to remove: ");
        int val = scanner.nextInt();

        Remove_Element sb = new Remove_Element();
        int newLength = sb.removeElement(nums, val);

        System.out.println("New length of the array: " + newLength);
        System.out.println("Modified array:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
