```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        /**
            배열 내 더해서 타겟이 되는 해당 두 개의 숫자의 인덱스를 반환 하는 문제입니다.
             
            정답의 되는 두 숫자의 인덱스의 순서는 상관이 없습니다.

            먼저 brute force 로 접근 해 보겠습니다.
            
            nums[0] + nums[1] = 7
            nums[0] + nums[2] = 7
            nums[0] + nums[3] = 13
            nums[1] + nums[2] ....
            nums[1] + nums[3] 
            nums[2] + nums[3] = 10 

            {2,3} 을 반환
         */
        int[] answer = new int[2];

        for(int i = 0; i < nums.length -1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        return answer;
    }
}


class Solution {
    public int[] twoSum(int[] nums, int target) {
        /**
            두 번째로 map 를 활용 할 수 있습니다.

            target - nums[i] = x 로 잡고

            맵에 x 가 포함 되 있다면

            x 대한 value 즉, index 와

            current value 에 대한 index 를 반환 합니다.

            HashMap을 사용하여 O(N)으로도 문제를 해결 할 수 있습니다.

            맵에는 배열의 각 요소와 해당 요소의 인덱스를 저장합니다 [ nums[i] , i ].

            배열을 순회하면서 타겟에서 현재 요소를 뺀 값을 키로 갖는지 확인합니다 target - nums[i] = x.

            만약 x가 맵에 존재하면 현재 요소와 해당 키로 저장된 인덱스를 반환합니다.
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

```
