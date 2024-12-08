import java.util.*;

public class Bits
{
public static void main(String args[])
{
//Scanner sc = new Scanner(System.in);
//int oper = sc.nextInt();

    int n=5;
    int pos=1;
    int bitMask=1<<pos;

    //Get bit
    if((bitMask & n)==0)
    {
        System.out.println("Bit was zero");
    } else{
       System.out.println("Bit was non-zero");
    }


    //set bit
    int newNumber = bitMask | n;
    System.out.println(newNumber);


    //clear bit
    //int notBitMask = ~(bitMask);
    //int newNumber = notBitMask & n;
   // System.out.println(newNumber);


    //update bit
    //int bitMask =1<<pos;
   // if(oper==1){
        //set
    
    //int newNumber = bitMask | n;

    //} else{
    //int newBitMask = ~(bitMask);
    //int newNumber = newBitMask & n;
    //System.out.println(newNumber);
    }
}
