class Solution {
    public boolean containsDuplicate(int[] nums) {
        /**
            sort => compare

            
         */
        // Approach 1 =  sort => two pointers => O(nlogn) => time limit exceeded

        //  Arrays.sort(nums);

        //  for(int i = 0; i < nums.length -1; i++) {
        //      for(int j = i + 1; j < nums.length; j++) {
        //          if(nums[i] == nums[j]) return true;
        //      }
        //  }

        //  return false;
        
        // Approach 2 = Set => O(N)

        Set<Integer> set = new HashSet<>();

        for(int num : nums) {
            if(set.contains(num)) return true;
            set.add(num);
        }

        return false;

    }
}