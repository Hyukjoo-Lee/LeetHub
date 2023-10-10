class Solution {
    public int[] getConcatenation(int[] nums) {
        /**
            2n
            ans = new int[nums.length * 2];
            ans[i + n] == nums[i]
            

            1. using two loop
            2. using index n

            for(0 ~ nums.length / 2)
                nums[i] = nums[i]
                nums[i+n] = nums[i+n]
        
         */
        // [1,2,1]
        int n = nums.length; 
        int[] ans = new int[n * 2];
        // num [1,2,1]
        // ans [0,0,0,0,0,0]
        // ans [1,0,0,1,0,0]
        // 
        for(int i = 0; i < n ; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;









    }
}