import java.util.*;

//  Encapsulation

// Person Class
class Person {
    // Encapsulating the name and age
    // only approachable and used using
    // methods defined
    private String name;
    private int age;

    public String getName(){
        return name;
    }
     public void setName(String name){
        this.name= name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
}


public class Encapsulation {
    
    public static void main(String[] args)
    {
       
        Person person = new Person();
        person.setName("Sakshi");
        person.setAge(19);
    
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}