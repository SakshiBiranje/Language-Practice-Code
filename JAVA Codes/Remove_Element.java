import java.util.Scanner;

public class Remove_Element{
public int Remove_ele(int[] nums, int v){
int k=0;
for(int x: nums){
if(x != nums[]){
nums[k]=nums[i];
k++;
}
}
return k;
} 
public static void main(String[] args){
Scanner sc = new Scanner();

System.out.println("Enter size of array: ");
int n=sc.nextInt();
int[] nums =new int[n];
System.out.println("Enter array elements: ");
for(int i=0;i<n;i++)
{
	nums[i]=sc.nextInt();
}
System.out.println("Enter element to remove: ");
int val =sc.nextInt();

Remove_Element sc = new Remove_Element();
int l= sc.Remove_element(nums,val);

System.out.println("New length of array : "+l)
System.out.println("Modified array: ");
for(int i=0 ;i<l ;i++)
{
System.out.println(nums[i]+" ");
}

}
}
