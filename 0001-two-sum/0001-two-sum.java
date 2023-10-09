class Solution {
    public int[] twoSum(int[] nums, int target) {
        /**
            nums [2,7,11,15] target = 9
            nums[0] + nums[0+1]
            nums[0] + nums[0+2]
            nums[0] + nums[0+3]
            ...
            nums[2] + nums[3]
         */

        
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j]==target) return new int[] {i,j};
            }
        }

        return null;










    }
}
