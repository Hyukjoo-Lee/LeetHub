class Solution {
    public int[] getConcatenation(int[] nums) {
        // {1,2,3}
        // {1,2,3,1,2,3}
        int ansArrLength = nums.length * 2;
        int[] ansArr = new int[ansArrLength];
        // [0,0,0,0,0,0]
        // [1,0,0,1,0,0]...
        for(int i = 0; i < nums.length; i++) {
            ansArr[i] = nums[i];
            ansArr[i + nums.length] = nums[i];
        }

        return ansArr;
    }
}