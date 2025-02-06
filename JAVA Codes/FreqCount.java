import java.util.HashMap;

public class FreqCount {
    public static void main(String[] args) {
        int arr[] = { 1,1,2,3,4,5,4,3,2,1,5,1,6,1,1,1,8,2,3,1};
        int n =arr.length;
        freq(arr, n);
    }  

    static void freq(int[] arr, int n) {
       boolean visited[] = new boolean[n];
       for(int i=0;i<n;i++){
        if(visited[i] == true) {
            continue;
        }
       
       int count =1;
       for(int j=i+1;j<n;j++) {
        if(arr[i]== arr[j]) {
            visited[j]= true;
            count++;
        }
       }
       System.out.println(arr[i] + " "+count);
           }
        }
    }



