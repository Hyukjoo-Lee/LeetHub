class Solution {
    public int[] twoSum(int[] nums, int target) {
        /**
            nums [2,7,11,15] target = 9
            [2:0] [7:1] [11:2] [15:3]
            if(containsKey(7)) {
                return new int[] {map.get(7), i}
            }
            [2:0] [7:1]
            7 = target - nums[i]
            x
            x = target - nums[i]
         */

        Map<Integer, Integer> map = new HashMap<>();
        // x = 9 - 2
        // [2:0]
        // x = 9 - 7 = 2

        for(int i = 0; i < nums.length; i++) {
            int x = target - nums[i];
            if(map.containsKey(x)) {
                return new int[] {map.get(x), i};
            }

            map.put(nums[i], i);
        }
         
        return null;









    }
}
