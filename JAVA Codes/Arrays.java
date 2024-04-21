import java.util.*;

public class Arrays 
{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of Array :");
    int size = sc.nextInt();
    int numbers[] =new int[size];
    System.out.println("Enter the elements of Array :");
    for(int i=0 ; i<size;i++) {
        numbers[i]=sc.nextInt();
    }
    System.out.println("Enter the number you want to search in the Array :");
    int x = sc.nextInt();
    for(int i=0 ; i<size;i++) {
        if(numbers[i] == x){
          System.out.println("x found at index :"+i);
         }
      }
    }
}