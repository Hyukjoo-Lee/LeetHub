class Solution {
    public int[] buildArray(int[] nums) {
        // Permutation (순열) = 원래의 데이터들을 순서는 고려한 채 선별
        // 다른 순서로 뒤섞음 

        // [0,5,1,3,2,4] 
        // ans[0] = nums[nums[0]] = 0
        // ans[1] = nums[nums[1]] = 2
        // ans[2] = nums[nums[2]] = 5
        // ...

        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;

    }
}