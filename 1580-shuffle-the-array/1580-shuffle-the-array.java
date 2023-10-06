class Solution {
    public int[] shuffle(int[] nums, int n) {
        /**
            x1 x2 xn y1 y2 yn
            x1 y1 x2 y2 x3 y3 

            nums = {2,5,1,3,4,7}
            n = 3
         */

         // nums[0] = nums[0]
         // nums[2] = nums[1]
         // nums[4] = nums[2]

         // nums[1] = nums[3]
         // nums[3] = nums[4]
         // nums[5] = nums[5]
        int[] result = new int[nums.length];
        int j = 0;

        for(int i = 0; i < nums.length; i++) {
            if(i%2 == 0) {
                result[i] = nums[j++];
            } else {
                result[i] = nums[n++];
            }    
        }

        return result;
    }   
}