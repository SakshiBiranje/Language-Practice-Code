import java.util.*;

public class  strBulider{
public static void main(String args[])
{
    StringBuilder sb = new StringBuilder("Tony");
    System.out.println(sb);

    //char at index 0
    System.out.println(sb.charAt(0));
     
    //set char at index 0
    sb.setCharAt(0, 'P');
    System.out.println(sb);

    //insert element
    sb.insert(2, 'n');
    System.out.println(sb);
    
    //delete extra n
    sb.delete(2,3);
    System.out.println(sb);

    //append (add at end)
    sb.append("e");
    sb.append("l");
    sb.append("o");
    System.out.println(sb);

    //length of string
    System.out.println(sb.length());
    
}

}