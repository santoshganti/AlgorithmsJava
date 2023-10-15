package searchingalgorithms;

// Basic search algorithms that loops through stuff and is almost always used in most algos including brute force algos
public class LinearSearch {
    public static int search(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,10,40};
        int x = 10;

        int result = search(arr,x);
        System.out.println(result);
    }
}
