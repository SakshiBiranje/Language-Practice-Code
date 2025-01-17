import java.util.*;

public interface string 
{
 public static void main(String args[])
 {
  /* strings are immutable i.e. we cannot change it once it is declared
  All wrpapper classes i.e. Integer, Character , Boolean , Long , float, Byte , Short 
  and Double are also immutable */
  
  
    String name1 = "Sakshi";
    String name2 = "Sakshi";
    
    //1 s1 >s2 = +ve value
    //2 s1==s2 = 0
    //3 s1<s2 = -ve value

    if(name1.compareTo(name2) == 0) {
        System.out.println("Strings are equal");
    }
    else 
    {
    System.out.println("Strings are not equal");

     }
   }
}
