class Solution {
    public int[] twoSum(int[] nums, int target) {
        /**
            [2,7,11,15] target = 9

            [0,1]

            [2:0, 7:1, 11:2, 15:3]  

            9 - 2 = 7
            target - nums[0] = nums[1]

            return [0,1]

         */
         Map<Integer, Integer> map = new HashMap<>();

         for(int i = 0; i < nums.length; i++) {
             int x = target - nums[i];
             if(map.containsKey(x)) {
                 return new int[] {i, map.get(x)};
             }
             map.put(nums[i], i);
         }

         return new int[] {};
    }
}
