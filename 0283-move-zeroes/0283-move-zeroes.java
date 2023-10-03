class Solution {
    public void moveZeroes(int[] nums) {


        
        // two pointer
        // first pointer will track non-zero values in the array
        // second pointer will track where the non-zero value be placed

        int pointer = 0;

        // [0,1,0,3,12]
        // i = 1 , pointer = 0
        // [1,0,0,3,12]
        // i = 2 , pointer = 1
        // i = 3 , pointer = 1
        // [1,3,0,0,12]
        // i = 4 , poniner = 2
        // [1,3,12,0,0]
        // to find the non-zero values in the array
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[pointer];
                nums[pointer] = temp;
                pointer++;
            }
        } 
        
    }
}