```java
​class Solution {
    public boolean containsDuplicate(int[] nums) {
        /**
            어레이에 중복된 값이 있으면 true, 아니면 false 를 반환하는 문제입니다.
            배열 길이에 제한이 없다면 간단히 nested loop 를 활용하여 해결 할 수 있습니다.
            (brute-force)

            첫번째 loop 에서는 array 의 각 요소를 얻고
            두번째 loop 에서 비교 할 후속 요소 얻어 둘을 비교합니다.

            하지만 이 솔루션은 time limit exceeded 를 반환합니다.
            중첩 루프 때문에 시간 복잡도가 O(n^2)로, 큰 배열에서는 비효율적이기 때문입니다.
         */

         for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j]) return true;
            }
         }

         return false;
    }
}

​class Solution {
    public boolean containsDuplicate(int[] nums) {
        /**
            시간 복잡도를 줄이기 위하여 HashSet 를 사용할 수 있습니다.
            HashSet의 각 요소를 distint하게 저장하는 특성을 활용합니다.
            이렇게 하면 시간 복잡도를 O(n) 까지 줄일 수 있습니다.
            
            HashSet.add() method 는 저장 할 요소가 이미 set 에 존재하면 false 를 반환합니다.
         */
         
         Set<Integer> set = new HashSet<>();
        
         for(int num : nums) {
            // 중복 발견
            if(!set.add(num)) return true;
         }

         return false;
    }
}

```
