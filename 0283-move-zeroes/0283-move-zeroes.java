class Solution {
    public void moveZeroes(int[] nums) {
        /**
            move all 0's to the end of nums array
            maintain the relative order
            in-place 
            fix start position
            [0,1,0,3,12]
         */

        int j = 0;
        // [0,1,0,3,12]
        //    i
        //  j
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        while(j < nums.length) {
            nums[j++] = 0;
        }















    }
}