
class Solution {
    public int[] twoSum(int[] nums, int target) {
        /**
            두 번째로 map 를 활용 할 수 있습니다.

            [ nums[i] , i ] 가 key-value 인
            target - nums[i] = x 로 잡고

            맵에 x 가 포함 되 있다면
            x 대한 value 즉, index 와
            current value 에 대한 index 를 반환합니다.
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