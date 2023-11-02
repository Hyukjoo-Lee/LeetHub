class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        /**
            return all triplets that sum equals to 0

            must not contain duplicate triplets
            => Set

            3 pointers 
            i, start , end
            
            to be sorted
            
            [-2,-1,0,1,2,3]
             i. s        e

            ** method takes the array 'a' which is required to be converted into a List. 
                Arrays.asList(a)
         */
        
        Set<List<Integer>> set = new HashSet<>();

        Arrays.sort(nums);
        int sum = 0;

        for(int i = 0; i < nums.length; i++) {
            int start = i + 1;
            int end = nums.length - 1;

            while(start < end) {
                sum = nums[i] + nums[start] + nums[end];
                if(sum == 0) {
                    set.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    start++;
                    end--;
                } else if (sum < 0) {
                    start++;
                } else {
                    end--;
                }
            } 
        }

        return new ArrayList<>(set);
    }
}