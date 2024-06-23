public class Recursion7 {
    public static int calPower(int x,int n){
        if(n ==0){
            return 1;
        }
        if(x ==0){
            return 0;
        }
        int xpownm1 = calPower(x,n-1);
        int xPown = x*xpownm1;
        return xPown;
    }
    //2^5=32 x^n stack height=n

    public static void main(String[] args) {
        int x=2,n=5;
        int ans = calPower(x,n);
        System.out.println(ans);
    }
}
