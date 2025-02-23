class BinaryAdd{
    public static void main(String[] args){
        int a=7;//111
        int b=2;  //10
        int sum = a+b;  // 7 + 2 = 9
                
        System.out.println("Concat Binary: " +Integer.toBinaryString(a)+ Integer.toBinaryString(b));  // concat 11110
       
        
        System.out.println("Binary of a: " + Integer.toBinaryString(a));
        System.out.println("Binary of b: " + Integer.toBinaryString(b));
        System.out.println("Sum in Binary: " + Integer.toBinaryString(sum));
    }
}