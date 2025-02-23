
/*
 The 1st coding question was based on strings in which we
were supposed to return no. of unique years from string
consisting of multiple dates(with dates in format dd-mm-
yyyy).
In the 3rd question, we were given an array and were asked
to sort it in such a way that odd and even numbers come
alternatively. E.g. if 10 25 20 40 55 is the i/p array then the
o/p array will be 10 25 20 55 40.

*/
import java.util.*;

public class ArraySortAlternating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> even = new ArrayList<Integer>();
        List<Integer> odd = new ArrayList<Integer>();

        for(int num : arr){
            if(num %2 ==0){
                even.add(num);
            }
            else{
                odd.add(num);
            }
        }

        int i=0, j=0, k=0;
        while(i< even.size() && j < odd.size()){
            arr[k++]= even.get(i++);
            arr[k++] = odd.get(j++);
        }
        if(i < even.size()){
            arr[k++]= even.get(i++);
        }
        if(i < odd.size()){
            arr[k++]= odd.get(i++);
        }
        
        System.out.println("Array final : ");
        for(int num :arr){
            System.out.println(num + " ");
        }
    }
}
