import java.util.*;
class Contains_Duplicate 
{
public boolean ContainsDuplicate(int[] nums) 
{
    Set<Integer>s= new HashSet<>();
    for(int num : nums){
        if(!s.add(num)){
            return true;
        }
    }
    return false;
}

public static void main(String[] args) 
{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of array : ");
    int size = sc.nextInt();
    int[] nums = new int[size];
    System.out.print("Enter array elments : ");
    for(int i=0;i<size;i++){
        nums[i]=sc.nextInt();
    }
    Contains_Duplicate obj= new Contains_Duplicate();
    
    if(obj.ContainsDuplicate(nums)){
        System.out.println("True"); //it contains duplicate value
    }
    else{
        System.out.println("False"); //it does not contain duplicate value
    }
}
}