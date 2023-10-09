class Solution {
    public boolean containsDuplicate(int[] nums) {
        /**
            using set
            if(set.contains(nums[i]))
         */
        
        Set<Integer> set = new HashSet<>();

        for(int num : nums) {
            if(set.contains(num)) return true;
            set.add(num);
        }

        return false;





    }
}