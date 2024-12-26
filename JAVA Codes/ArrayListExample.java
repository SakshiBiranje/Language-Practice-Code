import java.util.ArrayList;
//import java.util.Collections;

class ArrayListExample{
    public static void main(String[] args){
    ArrayList<Integer> list = new ArrayList<>();
    //add
    list.add(0);
    list.add(2);
    list.add(3);

    System.out.println(list);

    //get element at particular index
    int element1= list.get(1);
    System.out.println(element1);
    
    //add at particular index
    list.add(1,5);
    System.out.println(list);
    list.add(2,1);
    System.out.println(list);
    //sort in ascending order
   list.sort(null);
   System.out.println(list);


}
}