/*
Find the number of vowels present in the string

*/
import java.util.Scanner;
import java.util.*;
public class VowelCheck{
   
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a String : ");
       String s = sc.nextLine();
       String lowerCaseInput = s.toLowerCase();
      
       for(char ch : lowerCaseInput.toCharArray()){
            if(ch=='a'||ch =='i'|| ch=='e'||ch =='o'||ch=='u'){
                System.out.print(ch +" ");
            }
        }
    }

    }
    
