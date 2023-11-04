package net.santoshganti.LeetCodeProblems.TrappingRainWater;

public class TrappingRainWater {
    public int trap(int[] height) {
        //Init 2 arrays to store max height seen so far from left and right side
        int[] arr1 = new int[height.length]; //left side
        int[] arr2 = new int[height.length]; //right side
        int n = height.length; //Array length

        //Loop from left to right
        int maxLeft = 0;
        for (int i = 0; i < n; i++) {
            if (maxLeft < height[i]) {
                maxLeft = height[i];
            }
            arr1[i] = maxLeft;
        }

        //Loop from right to left
        int maxRight = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (maxRight < height[i]) {
                maxRight = height[i];
            }
            arr2[i] = maxRight;
        }

        int totalWater = 0;
        for (int i = 0; i < n; i++) {
            int waterAtIndex = Math.min(arr2[i], arr1[i]) - height[i];
            totalWater += waterAtIndex;
        }

        return totalWater;


    }
}
