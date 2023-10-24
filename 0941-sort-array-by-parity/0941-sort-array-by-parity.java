class Solution {
    public int[] sortArrayByParity(int[] nums) {
        /**
            if num is even, move the num at the beginning of the array
            and move all odd integers  

            two pointers?
            swap

         */

        int start = 0;
        int end = nums.length -1;

        while(start < end) {

            if(nums[start] % 2 == 1 && nums[end] % 2 == 0) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
                continue;
            }

            if(nums[start] % 2 == 0) {
                start++;
            }

            if(nums[end] % 2 == 1) {
                end--;
            }
        }

        return nums;
    }
}