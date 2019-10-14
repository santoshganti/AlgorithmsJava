package arrays.besttimestocks;

public class BestTimeStocks {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            int diff = prices[i] - prices[i - 1];
            if (diff > 0) {
                profit += diff;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        BestTimeStocks test = new BestTimeStocks();
        int[] array = {7, 6, 4, 3, 1};
        int result = test.maxProfit(array);
        System.out.println(result);
    }
}
