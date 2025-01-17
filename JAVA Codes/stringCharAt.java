import java.util.*;

public class  stringCharAt
{
    public static void main(String arg[])
    {
        String firstName = "Tony";
        String lastName = "Stark";
        String fulName = firstName +" "+lastName;
        //tony Stark
        System.out.println(fulName.length());
        //charAt
        int n =5 ;
        for(int i=0; i<fulName.length();i++)
        {
            System.out.println(fulName.charAt(i));
        }
        //compare
        
        String sentence ="TonyStark";
        String name = sentence.substring(4);
        System.out.println(name);
    }
}