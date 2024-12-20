import java.util.*;

public class String2
{
    
    public static void main(String[] args){
        String s = "Tony";
        s.concat("Stark");
        // op will be Tony
        System.out.println(s);
        s= s.concat(" Stark");
        System.out.println(s);
        // op will be Tony Stark
        
    }
}