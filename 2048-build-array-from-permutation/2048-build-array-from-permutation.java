class Solution {
    public int[] buildArray(int[] nums) {
        /**
            ans[i] = nums[nums[i]]
            simply using this formula
         */

         int[] ans = new int[nums.length];

         for(int i = 0; i < nums.length; i++) {
             ans[i] = nums[nums[i]];
         }

         return ans;
    }
}