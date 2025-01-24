import java.util.Arrays;
public class Sort1{
    public static void main(String[] args){
        int[] nums = { 2,7,6,9,2,5,3,66,54,100,83,14,27,47};
        Arrays.sort(nums);
        
        System.out.println("Sorted Array : " + Arrays.toString(nums));
    }
}