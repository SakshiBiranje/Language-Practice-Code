import java.util.Scanner;
public class Best_Time_to_Buy_and_Sell_Stock_II 
{
    public int maxProfit(int[] prices) {
        int ans = 0;
        for (int i = 1; i < prices.length; ++i) {
            ans += Math.max(0, prices[i] - prices[i - 1]);
        }
        return ans;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Best_Time_to_Buy_and_Sell_Stock_II calculator = new  Best_Time_to_Buy_and_Sell_Stock_II();
        System.out.print("Enter number of days: ");
        int n = sc.nextInt();
        int[] prices = new int[n];
        System.out.print("Enter prices:");
        for(int i=0;i<n;i++){
        prices[i]= sc.nextInt();
        }
        int profit = calculator.maxProfit(prices);
        
        System.out.println("Maximum Profit: " + profit);
    }
}