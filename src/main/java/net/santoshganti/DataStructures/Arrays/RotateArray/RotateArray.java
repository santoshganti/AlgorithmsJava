package net.santoshganti.DataStructures.Arrays.RotateArray;

public class RotateArray {
    public static void main(String[] args) {
        RotateArray rotateArray = new RotateArray();
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        rotateArray.rotateArrayUsingTempArray(array, 3);
    }

    private void rotateArrayUsingTempArray(int[] nums, int k) {
        int[] a = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            a[(i + k) % nums.length] = nums[i];
        }

        System.arraycopy(a, 0, nums, 0, nums.length);
    }

    public void rotateArrayOneByOne(int[] nums, int k) {
        k = k % nums.length;
        int count = 0;
        for (int start = 0; count < nums.length; start++) {
            int current = start;
            int prev = nums[start];

            do {
                int next = (current + k) % nums.length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (start != current);
        }
    }
}
