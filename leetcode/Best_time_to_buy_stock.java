import java.util.*;

public class  Best_time_to_buy_stock{
    public static int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int n = prices.length;
        int maxProfit = 0;

        for (int i = 0; i < n; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            }
            int profit = prices[i] - buy;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        
        return maxProfit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        System.out.print(maxProfit(prices));
    }
}