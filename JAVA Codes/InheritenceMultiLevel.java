import java.util.*;

//multilevel Inheritence
//java does not support multiple inheritence 
class one{
    public void flower(){
        System.out.println("Flower!");

    } 
}
class two extends one{
    public void rose(){
        System.out.println("Rose!");
    }
}

class three extends two{
    public void lily(){
        System.out.println("Lily!");
    }
}



class InheritenceMultiLevel{
    public static void main(String[] args){
   // three obj = new three();
    three obj = new three();

    obj.lily();
    obj.rose();
    obj.flower();
    }
}