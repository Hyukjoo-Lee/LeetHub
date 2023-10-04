class Solution {
    public int[] getConcatenation(int[] nums) {
        /**
            ans[i] == nums[i]
            ans[i + n] == nums[i]
            0-indexed

            we can solve this problem simply looping nums array twice
         */
        int[] answer = new int[nums.length * 2];

        // [1,2,3]
        // answer[0] = 1
        // answer[1] = 2
        // answer[2] = 3 
        for(int i = 0; i < nums.length; i++) {
            answer[i] = nums[i];
        }

        // nums.length = 3
        // answer[3] = 1
        // answer[4] = 2
        // answer[5] = 3
        int j = 0;
        for(int i = nums.length; i < answer.length; i++) {
            answer[i] = nums[j++];
        }
         
        return answer;
    }
}