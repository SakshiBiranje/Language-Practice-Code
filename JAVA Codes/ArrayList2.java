import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ArrayList2 {
    //Q2) Write a Java program to create a new array list, add some colors (string) and print out the collection as sorted list.
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Orange");
        list.add("White");
        list.add("Red");
        list.add("Blue");
        list.add("pink");
        System.out.println("Before sorting : " + list);
        Collections.sort(list);
        System.out.println("Sorted list of colors: " + list);
    }
    }
