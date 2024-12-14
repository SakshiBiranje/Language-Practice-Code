import java.io.*;

abstract class Helper 
{
    abstract void check(String name);
}
//abstract class
public class MainClass extends Helper
{
    public static void main(String[] args)
    {
    MainClass obj = new MainClass();
    obj.check("Tony");
    }
    @Override 
    void check(String name)
    {
    System.out.println(name);
}
}

