
class Employee{
    String comapany = "Persistent";
}
class emp1 extends Employee{
    int id = 1122;
    int salary = 75000;
}
//single inheritence
class InheritenceSIngle{
    public static void main(String[] args){
        emp1 e1 = new emp1();
        
        System.out.println("Comapny :"+ e1.comapany + " "+ "Salary :" + e1.salary);
        System.out.println("Id :"+ e1.id);
    }
}