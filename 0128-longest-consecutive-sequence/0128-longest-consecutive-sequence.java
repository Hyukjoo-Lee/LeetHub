class Solution {
    public int longestConsecutive(int[] nums) {
        /**
            Telus Health final 코테 기출문제

            정렬되지 않은 정수 배열이 주어지고
            '최장 공통 부분 수열 = LCS' 의 길이를 반환하는 문제입니다.
        
            솔루션의 time complexity가 O(N) 이여야 합니다.
            예로 [100,4,200,1,3,2] 가 주어지면
            요소중에서 [1,2,3,4] 가 LCS 이므로 정답은 4가 됩니다.
            
            정렬해서 최장길이를 판단하는 방법이 있고
            HashSet을 활용하여 중복 제거를 한 후 최장길이를 판단하는 방법이 있습니다.

            Constraints 로 O(N) 의 time complexity 가 주어졌으니 두번째 방법이 적합합니다.
         */
        Set<Integer> set = new HashSet<>();

        for(int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for(int num : set) {
            if(!set.contains(num-1)) {
                int currentNum = num;
                // 초기화
                int currentSequence = 1;
                while(set.contains(currentNum+1)) {
                    currentNum++;
                    currentSequence++;
                }
                longest = Math.max(longest, currentSequence);
            }
        }

        return longest;
    }
}