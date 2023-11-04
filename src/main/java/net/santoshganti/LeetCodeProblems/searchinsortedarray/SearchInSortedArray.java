package net.santoshganti.LeetCodeProblems.searchinsortedarray;

public class SearchInSortedArray {
    public static void main(String[] args) {
        SearchInSortedArray s = new SearchInSortedArray();
        System.out.println(s.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
    }

    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int midPoint = left + (right - left) / 2;
            if (nums[midPoint] > nums[right]) {
                left = midPoint + 1;
            } else {
                right = midPoint;
            }
        }

        int start = left;
        left = 0;
        right = nums.length - 1;

        if (target >= nums[start] && target <= nums[right]) {
            left = start;
        } else {
            right = start;
        }

        while (left <= right) {
            int midPoint = left + (right - left) / 2;
            if (nums[midPoint] == target) {
                return midPoint;
            } else if (nums[midPoint] < target) {
                left = midPoint + 1;
            } else {
                right = midPoint - 1;
            }
        }
        return -1;
    }
}
