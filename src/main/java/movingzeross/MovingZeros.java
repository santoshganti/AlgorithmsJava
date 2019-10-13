package movingzeross;

public class MovingZeros {
    public static void moveZeroes(int[] nums) {
        //Move non zero elements to the index and fill the array with zeros later
        int index = 0;

        for(int i =0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[index++] = nums[i];
            }
        }

        for(int i = index; i < nums.length; i++){
            nums[i] = 0;
        }

    }
    public static void main(String[] args) {
        int[] i = {0,1,0,3,12};
//        System.out.println(moveZeroes(i));
    }
}
