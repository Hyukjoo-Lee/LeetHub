class Solution {
    public int singleNumber(int[] nums) {
        /**
            every element appears twice except for one < find this one
            linear runtime complexity - O(N)
            const extra space - O(1)

            HashMap
            [4,1,2,1,2]
            [4:1] [1:2] [2:2]
            if(map.get(4) == 1) {
                return map.get(4)
            }
         */

        Map<Integer, Integer> map = new HashMap<>();
        
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // loop map
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer value = entry.getValue();
            if(value == 1) {
                return entry.getKey();
            }
        }
        
        return -1;
    }
}