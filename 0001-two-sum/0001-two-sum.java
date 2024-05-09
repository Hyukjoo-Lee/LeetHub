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
