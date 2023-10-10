class Solution {
    public int removeDuplicates(int[] nums) {
        /**
           // [1,1,2]
           // fix the start point and find the different num and store that number into start point
         */
         int k = 1;
         int start = 1;
         for(int i = 1; i < nums.length; i++) {
             if(nums[i] != nums[i-1]) {
                nums[start] = nums[i];
                k++;
                start++;
             }
         }

         return k;
    }
}