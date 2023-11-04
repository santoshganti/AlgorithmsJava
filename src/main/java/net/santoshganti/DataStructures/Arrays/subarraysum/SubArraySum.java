package net.santoshganti.DataStructures.Arrays.subarraysum;

import java.util.HashMap;

public class SubArraySum {
    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] myIntArray = {1, 1, 1};
        System.out.println(subarraySum(myIntArray, 2));
    }
}
