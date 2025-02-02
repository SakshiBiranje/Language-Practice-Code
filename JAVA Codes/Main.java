import  java.util.*;
public class Main {
     public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     String input = "a1b2c3"; 
     String result = modifyString(input); 
     System.out.println(result); 
     }

     public static String modifyString(String str) {
        StringBuilder modifiedString = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
           
            if ((i + 1) % 3 == 0) {
               
                char prevChar = str.charAt(i - 1);
                modifiedString.append(String.valueOf(prevChar).repeat(i));
            } else {
                modifiedString.append(str.charAt(i)); 
            }
        }

        return modifiedString.toString();
    } 
}

/*  program 2
 *  System.out.println("String : ");
    String s = sc.nextLine();
    System.out.println("flag : ");
    String flag= sc.nextLine();
    s = s.concat(flag);
    System.out.println(s);
    char replacement = 'X';
   String result = ModifiedString(s, replacement);
   System.out.println(result);


       }
       public static String ModifiedString(String s, char replacement){
        StringBuilder modified = new StringBuilder(s);
        for(int i=2;i<s.length();i+=3){
            modified.setCharAt(i, replacement);
        }

        return modified.toString();
       }
    }
 */

      /*   program 3 
      
      System.out.println("Size of Array :");
        int n = sc.nextInt();
       
        int[] arr = new int[n];
        System.out.println("Elements : ");
        for(int i=0;i<n ;i++){
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        int last =arr[n-1];
        boolean found = false;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n-1;j++){
           if(last == arr[i]+ arr[j]){
           found = true;
           break ;
           }
            }
            if(found) break;
        }
        if(found){
            System.out.println("true");
        }
       else
        {
            System.out.println("false");
            return;
           }
            */
    
