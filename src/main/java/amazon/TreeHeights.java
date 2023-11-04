package amazon;

import java.util.Arrays;
import java.util.Scanner;

public class TreeHeights {

    private static String TreeHeightsSolution1(int[] nums, int X) {
        int n = nums.length;

        int minN = Arrays.stream(nums).min().getAsInt();

        for (int i = 0; i < nums.length; i++) {
            nums[i] -= minN;
        }

        int maxN = Arrays.stream(nums).max().getAsInt() + 1;

        int[][] dp = new int[n][maxN];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
            // sauravhathi
        }

        for (int j = 0; j < maxN; j++) {
            dp[0][j] = Math.abs(nums[0] - j);
        }

        for (int i = 1; i < nums.length; i++) {

            int min_so_far = Arrays.stream(dp[i - 1]).limit(i).min().getAsInt();

            for (int j = i; j < maxN; j++) {
                dp[i][j] = Math.abs(nums[i] - j) + min_so_far;
                min_so_far = Math.min(min_so_far, dp[i - 1][j]);
            }
        }

        return Arrays.stream(dp[n - 1]).min().getAsInt() <= X ? "YES " + Arrays.stream(dp[n - 1]).min().getAsInt() : "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(TreeHeightsSolution1(nums, X));
    }
}