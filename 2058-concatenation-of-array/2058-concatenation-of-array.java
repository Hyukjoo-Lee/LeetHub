class Solution {
    public int[] getConcatenation(int[] nums) {
        /**
            ans[i] == nums[i]
            ans[i + n] == nums[i]
            0-indexed

            we can solve this problem simply looping nums array twice,
            Can we solve this problem using only one loop?
            
         */
        int[] answer = new int[nums.length * 2];
        int n = nums.length;

        for(int i = 0; i < answer.length; i++) {
            if(i  < nums.length) {
                answer[i] = nums[i];
            } else {
                answer[i] = nums[i - n];
            }

        }

        return answer;
    }
}