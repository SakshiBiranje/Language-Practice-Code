class MethodOverloading{

    public int add(int n1 , int n2, int n3){
        return n1 + n2 + n3;
    }
    public int add(int n1 , int n2){
        return n1 + n2 ;
    }
    
    public double add(double n1 , int n2, int n3){
        return n1 + n2 ;
    }

    // all 3 methods have same name but pararmeters and its types is different 
    // so it will work for all possible parameter type inputs
    public static void main(String[] args)
    {
        MethodOverloading obj = new MethodOverloading();
       // int result = obj.add(3,4,5);
      //  int result = obj.add(3,4);
        int result = obj.add(10 , 20, 15);
        System.out.println(result);
    }
}