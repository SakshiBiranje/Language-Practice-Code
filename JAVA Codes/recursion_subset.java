import java.util.*;

public class recursion_subset {
    public static void printSubset(ArrayList<Integer> subset){
        for(int i=0;i<subset.size();i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }

    public static void FindSubsets(int n , ArrayList<Integer>subset) {
        if(n== 0){
            printSubset(subset);
            return;
        }
        subset.add(n);
        FindSubsets(n-1, subset);

        subset.remove(subset.size()-1);
        FindSubsets(n-1, subset);
    }
    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        FindSubsets(n, subset);
    }
}
