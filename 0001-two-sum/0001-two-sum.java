class Solution {
    public int[] twoSum(int[] nums, int target) {
        /**
            nums   [2, 1, 5, 9]
            target =  14
            nums[0] + nums[1]
            nums[0] + nums[2]
            nums[0] + nums[3]
            ...
            nums[2] + nums[3] = 14
            return true

            for (int i = 0; i < nums.length; i++)

                for (int j = i+1; j < nums.length; j++)
                    

         */
         // nums[0] + nums[0+1]
         // nums[0] + nums[0+2]
         // nums[0] + nums[0+3]
         // nums[1] + nums[2]
         // nums[2] + nums[3]
         for(int i = 0; i < nums.length; i++) {
             for(int j = i + 1; j < nums.length; j++) {
                 if(nums[i] + nums[j] == target) {
                     return new int[] {i,j};
                 }
             }
         }


        return null;



    }
}
