class Solution {
    public int[] productExceptSelf(int[] nums) {
        /**
            1, 2, 3, 4
            1, 1, 2, 6 - left
            24 12 4  1 - right
            prefix(left) 는 왼쪽에 있는 모든 원소의 곱을 포함
            suffix(right) 는 오른쪽에 있는 모든 원소의 곱을 포함
            result 는 왼쪽에 있는 모든 원소의 곱 * 오른쪽에 있는 모든 원소의 곱
            즉 자신을 제외한 모든 원소의 곱이 된다
         */
        int l = nums.length;
        int[] left = new int[l];
        int[] right = new int[l];
        int[] result = new int[l];

        left[0] = 1;
        right[l-1] = 1;

        for(int i = 1; i < l; i++) {
            left[i] = nums[i-1] * left[i-1];
        }

        for(int i = l-2; i >= 0; i--) {
            right[i] = nums[i+1] * right[i+1];
        }

        for(int i = 0; i < l; i++) {
            result[i] = left[i] * right[i];
        }

        return result;
    }
}