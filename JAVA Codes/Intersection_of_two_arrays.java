import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Intersection_of_two_arrays 
{
    public int[] intersect(int[] nums1, int[] nums2) 
    {
        Map<Integer, Integer> counter = new HashMap<>();

        for (int num : nums1) 
        {
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }
        List<Integer> t = new ArrayList<>();

        for (int num : nums2) 
        {
              if (counter.getOrDefault(num, 0) > 0) 
              {
                    t.add(num);
                counter.put(num, counter.get(num) - 1);
            }
        }
        int[] res = new int[t.size()];
        for (int i = 0; i < res.length; ++i) 
        {
            res[i] = t.get(i);
        }
        return res;
    }

        public static void main(String[] args) 
        {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();
        int[] nums1 = new int[size1];
        System.out.print("Enter the elements of the first array: ");
        for (int i = 0; i < size1; i++) {
            nums1[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();
        int[] nums2 = new int[size2];
        System.out.print("Enter the elements of the second array: ");
        for (int i = 0; i < size2; i++) {
            nums2[i] = scanner.nextInt();
        }

        Intersection_of_two_arrays obj= new Intersection_of_two_arrays();
        
        int[] result = obj.intersect(nums1, nums2);
        
        System.out.print("Intersection: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
