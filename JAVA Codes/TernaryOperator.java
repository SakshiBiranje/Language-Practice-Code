public class TernaryOperator
{
    //syntax : condition ? if true : if false
    public static void main (String[] args)
    {
    int a = 20 , b = 10 , c = 30 , result;
    
    result= ((a > b) ? (a > c) ? a : c :(c > b) ? b : c);
    System.out.println("Max of three : "+ result); 
    }
}

//bitwise operator : & , | , ^, ~
// shift operator : a>>1, a <<1
