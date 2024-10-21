import java.util.*;
import java.util.Scanner; 

class SearchInsertPosition 
{
    public int searchInsert(int[] nums, int target) 
    {
        int left = 0, right = nums.length;
        while (left < right) 
        {
            int mid = (left + right) >> 1;  // ethe left shift operator(>>) vaprlai instead of (l+r)/2 ....divide by 2 pn vapru shakto
            if (nums[mid] >= target) 
            {
                right = mid;
            } else  {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size= sc.nextInt();

        int nums[] = new int[size];
        System.out.println("Enter array Elements : ");
        
        for(int i=0;i<size;i++)
        {
            nums[i]= sc.nextInt();
        }
        System.out.println("Enter target element: ");
        int target= sc.nextInt();

        SearchInsertPosition obj = new SearchInsertPosition();
        int ans= obj.searchInsert(nums, target);

        System.out.println("POsition to Insert : "+ans);
    }
}
