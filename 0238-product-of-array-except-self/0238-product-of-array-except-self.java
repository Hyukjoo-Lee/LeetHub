class Solution {
    public int[] productExceptSelf(int[] nums) {
        /**
            배열 내 nums[i] 가 제외된 나머지 모든 요소의 곱으로 이루어진 
            배열 answer 를 반환하는 문제입니다.
    
            예를 들어 인풋으로 [1,2,3,4] 가 주어지면 
            nums[0] = 2*3*4 = 24
            nums[1] = 1*3*4 = 12
            nums[2] = 1*2*4 = 8
            nums[3] = 1*2*3 = 6
            [24,12,8,6] 이 반환 됩니다.
        
            이 문제는 prefix 와 suffix 의 개념을 사용하여 해결 가능합니다.
            [1,2,3,4] 를 살펴보면
            답의 각 요소에 대한 조건은 해당 요소를 제외한 왼쪽, 오른쪽 값을 곱해야 한다는 것입니다.

            [1,1,2,6] - prefix (왼쪽에 있는 모든 원소의 곱을 포함)
            [24,12,4,1] - suffix (오른쪽에 있는 모든 원소의 곱을 포함)
            [24,12,8,6] - answer = prefix * suffix

         */

        int length = nums.length;
        int[] left = new int[length];
        int[] right = new int[length];
        int[] result = new int[length];

        // 처음 인덱스 0은 왼쪽, 오른쪽에 있는 원소의 곱이 없음, 즉 value 를 1 로 초기화
        left[0] = 1;
        right[length -1] = 1;

        for(int i = 1; i < length; i++) {
            left[i] = nums[i-1] * left[i-1];
        }

        for(int i = length -2; i >= 0; i--) {
            right[i] = nums[i + 1] * right[i + 1];
        }
        
        // result
        for(int i = 0; i < length; i++) {
            result[i] = left[i] * right[i];
        }
        return result;
    }
}