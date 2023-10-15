package dynamicprogramming;

import java.util.Arrays;

public class Coins {
    public static int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 0; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    if(i == amount){
                        if ((1 + dp[amount - coins[j]]) <= dp[amount]) {
                            for (int k = 0; k < dp[coins[j]]; k++) {
                                System.out.println("take "+ coins[j]);
                            }
                        }
                    }
                    dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
                } else {
                    break;
                }
            }
        }


        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;
        coinChange(coins, amount);
    }
}
