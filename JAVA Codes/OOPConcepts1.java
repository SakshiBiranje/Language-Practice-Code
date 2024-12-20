import java.util.*;
import java.util.Scanner;

/*
  OOP Concepts
  Class : A class is a blueprint from which objects created
  Objects : represents entities
  Method : Method is a collection of statements to perform a specific task by calling return result
           It can be used with or without arguments 
 */

 class OOPConcepts1{
    int id;
    String name;
    public void printStudents(){
        System.out.println("Id : "+id);
        System.out.println("Name : "+name);

    }
    public static void main(String[] args){
        OOPConcepts1 obj = new OOPConcepts1();
        obj.id =1;
        obj.name= "Sakshi";

        obj.printStudents();
    }
 }