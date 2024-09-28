import java.util.Scanner;

class Single_Number
{
    public int SingleNumber(int[] nums) 
    {
        int ans=0;
        for(int value : nums)
        {
            ans ^= value; //XOR operator
        }
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.print("Enter elements : ");
        for(int i=0;i<size;i++)
        {
            nums[i] = sc.nextInt();
        }
        Single_Number obj = new Single_Number();
        int ans = obj.SingleNumber(nums);
        System.out.println("Single Number : "+ ans);
    }
}