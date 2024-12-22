import java.util.Scanner;

class MoveZeros {
    public void moveZeroes(int[] nums) {
        int i = -1, n = nums.length;
        for (int j = 0; j < n; ++j) {
            if (nums[j] != 0) {
                int t = nums[++i];
                nums[i] = nums[j];
                nums[j] = t;
            }
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
    
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) 
        {
            nums[i] = sc.nextInt();
        }
        
        MoveZeros mz = new MoveZeros();
        mz.moveZeroes(nums);
        
        System.out.println("Array after moving zeroes to the end:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
