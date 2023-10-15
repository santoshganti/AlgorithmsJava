package arrays.sortingalgorithms;

/**
 * Selection sorts an array by repeatedly finding the minimum element from unsorted part and putting it at the beginning
 * <p>
 * The algorithm maintains two subarrays in a given array.
 * <p>
 * 1. The subarray which is already sorted
 * 2. Remaining subarray which is not sorted.
 */
public class SelectionSort {

    private void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            //find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        SelectionSort ob = new SelectionSort();
        int[] arr = {64, 25, 12, 22, 11};
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }

    private void printArray(int[] arr) {
        int n = arr.length;
        for (int value : arr) {
            System.out.println(value + " ");
        }
        System.out.println();
    }
}
