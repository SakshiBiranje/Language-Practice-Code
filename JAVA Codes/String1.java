import java.util.*;

public class String1
{
    public static void main(String[] args){
        /*
         * String immutability means that once a string object is created, 
         * its value cannot be changed. Any modification results in the creation of a new string.
         * Strings are immutable for security, performance, and thread safety reasons.
         * It prevents unwanted changes and helps optimize memory usage.
         */
        
        String str = new String("Hi , there!!");
        System.out.println(str);
    }
}