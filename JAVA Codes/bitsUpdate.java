import java.util.*;

public class bitsUpdate{
public static void main(String args[]){
Scanner scanner = new Scanner(System.in);
int oper = scanner.nextInt();

    int n=5;
    int pos=1;
    //update bit
    int bitMask =1<<pos;
    if(oper==1){
        //set
    //int bitMask=1<<pos;
    int newNumber  = bitMask | n;
      } 
    else{
    int newBitMask = ~(bitMask);
    int newNumber = newBitMask & n;
    System.out.println(newNumber);
    }
}
}