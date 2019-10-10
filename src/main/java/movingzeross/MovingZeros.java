package movingzeross;

public class MovingZeros {
    public static void moveZeroes(int[] nums) {
        int counter = 0;

        for(int i = 0; i < nums.length ; i++){
            if (nums[i] == 0) {
                counter += 1;
            }

            if (counter > 0) {
                nums[i - counter] = nums[i];
            }
        }
    }

    public static void main(String[] args) {
        int[] i = {0,1,0,3,12};
//        System.out.println(moveZeroes(i));
    }
}
