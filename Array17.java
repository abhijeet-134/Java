import java.util.*;

public class Array17 {
    public static int buyAndSellStock(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++) {
            if(buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        // int prices[] = {7, 6, 4, 3, 1};

        int result = buyAndSellStock(prices);

        if(result != 0) {
            System.out.println("Max Profit is : " + result);
        }else {
            System.out.println("Max profit is : 0");
        }
    }
}