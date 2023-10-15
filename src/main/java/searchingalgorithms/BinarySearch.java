package searchingalgorithms;

public class BinarySearch {
    public static int binarySearch(int[] arr, int x){
        int mid = 0;
        int l = 0;
        int r = arr.length - 1;

        while( l <= r){
            int m = 1 + (r - 1)/2;

            if(arr[m] == x){
                return m;
            }

            if(arr[m] < x){
//                1 = ,
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,10,40};
        int x = 10;

        int result = binarySearch(arr,x);
        System.out.println(result);
    }
}
