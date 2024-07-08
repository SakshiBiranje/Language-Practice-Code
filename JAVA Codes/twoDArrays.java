import java.util.*;

public class twoDArrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows:");
        int rows = sc.nextInt();
        System.out.print("Enter no. of columns: ");
        int col = sc.nextInt();
        System.out.print("Matrix:");
        int[][]numbers = new int[rows][col];
        //input 
        //rows
        for(int i=0; i<rows ; i++){
            //cols
            for(int j=0; j<col ; j++){
                numbers[i][j] = sc.nextInt();

            }
        }
        System.out.print("Enter element :");
        int x = sc.nextInt();
        for(int i=0; i<rows ; i++){
            //cols
            for(int j=0; j<col ; j++){
                if(numbers[i][j] == x) {
                    System.out.println("x found at location :(" + i + "," + j + ")");
                }
            }
    }
   }
}