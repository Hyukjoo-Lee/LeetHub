class Solution {
    public int maxArea(int[] height) {
        /**
         * 정수 배열 height 가 주어지고 길이는 n 입니다.
         * 이 중에 두 개의 선을 선택해서 컨테이너를 형성하는데
         * 컨테이너가 담을 수 있는 최대 물의 양을 반환하는 문제입니다.
         * 
         * 두 개의 포인터를 활용하여 문제를 해결 할 수 있습니다.
         */

        // 최대 물의 양
        int max = 0;
        // start 포인터
        int start = 0;
        // end 포인터
        int end = height.length - 1;

        while (start < end) {
            // 현재 포인터가 형성하는 컨테이너의 물의 양을 계산하고 최대 값 갱신
            max = Math.max(max, Math.min(height[start], height[end]) * (end - start));

            // 더 작은 높이의 포인터를 움직여 더 큰 컨테이너를 찾음
            if (height[start] < height[end]) {
                // start 포인터의 높이가 더 작으면 포인터를 오른쪽으로
                start++;
            } else {
                // end 포인터의 높이가 더 작거나 같으면 왼쪽으로 이동
                end--;    
            }
        }
        return max;
    }
}
