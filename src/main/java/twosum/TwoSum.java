package twosum;

import java.util.HashMap;

public class TwoSum {

    private static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++){
            if(hashMap.containsKey(target - nums[i])){
                return new int[]{hashMap.get(target - nums[i])};
            }else{
                hashMap.put(nums[i], i);
            }
        }

        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] array = {2, 7, 11, 15};
        int[] result = twoSum(array, 9);
        System.out.println(result);
    }
}
