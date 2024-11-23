package two_pointers;

public class _283_MoveZeroes {
    /** Solved **/
    public void moveZeroes(int[] nums) {
        int index = -1;
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = 0;
                nums[++index] = temp;
            }
        }
    }
    /** Solved **/
}
