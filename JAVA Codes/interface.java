import java.util.Scanner;

interface Client {
    void input();
    void output();
}
class ABC implements Client 
{
    private String name;
    private String address;
    private double salary;
    
    public void input() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        name = sc.nextLine();
        
        System.out.print("Enter address: ");
        address = sc.nextLine();
        
        System.out.print("Enter salary: ");
        salary = sc.nextDouble();
        
       sc.close();
    }
    
    public void output() 
    {
        System.out.printf("Name: %s%n", name);
        System.out.printf("Address: %s%n", address);
        System.out.printf("Salary: %.2f%n", salary);
    }
    
    public static void main(String[] args) {
        ABC obj = new ABC();
        obj.input();
        obj.output();
    }
}
