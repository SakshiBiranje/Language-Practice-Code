import java.util.Scanner;

class GCD{

    public static int GCDFinder(int a , int b){
        int ans=0;
        if(a>b){
            for(int i=0; i<=b;i++){
           a=a%b;
           if(a!=0){
            ans =a;
            } else{
            ans =b;
           }
           
            }
        }
        else{
        for(int i=0; i<=a;i++)
        {
           b=b%a;
           if(b!=0){
            ans =b;
           }
           else{
            ans =a;
           }
           
            }
        }
              
        return ans;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a= sc.nextInt();
        int b = sc.nextInt();

        int result = GCDFinder(a,b);
        System.out.println(result);
    }
}