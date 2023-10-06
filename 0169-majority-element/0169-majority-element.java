class Solution {
    public int majorityElement(int[] nums) {
        /**
            another simple solution
            just get the element's value on the middle index
            because it is impossible to exceed the given length of index
            e.g., [1,2,2,2,1]
            sort the array
            [1,1,2,2,2]
            middle element must be the majority element
         */

        Arrays.sort(nums);
        int n = nums.length;
        int middleIdx = n / 2;
        return nums[middleIdx];





    }
}