class Solution {
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