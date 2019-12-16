package arrays.besttimestocks;

public class BestTimeStocks {
    public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int price : prices) {
            if (price < minprice)
                minprice = price;
            else if (price - minprice > maxprofit)
                maxprofit = price - minprice;
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        BestTimeStocks test = new BestTimeStocks();
        int[] array = {7,1,5,3,6,4};
        int result = test.maxProfit(array);
        System.out.println(result);
    }
}
