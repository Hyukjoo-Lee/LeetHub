class Solution {
    public int maxArea(int[] height) {
        /**
            길이가 n 인 height 배열이 주어지고
            n 개의 그래프가 있습니다.

            그 중에 두 개의 endpoint 를 선택해서

            (i, 0) and (i, height[i]) 로 그리면

            컨테이너가 형성이 되고 여기서 컨테이너가 최대로 담을 수 있는 물의양을 리턴하는 문제입니다.

            예로들어

            [1,8,6,2,5,4,8,3,7] 이 주어지면
             s               e
            8와 7의 높이가 선택 될 것이고

            이 높이를 기준으로 컨테이너를 형성하면 7 * 7 = 49 가 반환 되어야 합니다.

            max - 물의 양을 업데이트 하면서 

            start 포인터와 end 포인터를 조작하여 최대로 담을 수 있는 물의 양을 리턴 하면 되지 않을까?

         */


        int max = 0;
        int start = 0;
        int end = height.length - 1;

        int temp = 0;

        while(start < end) {
            // 현재 두 포인터가 형성하는 컨테이너의 물의 양을 어떻게 계산하고 최대 값을 갱신 해야 하느냐
            // height[end] or height[start] 중에 작은 값 * (end - start)
            max = Math.max(max,Math.min(height[start], height[end]) * (end - start));

            if(height[start] < height[end]) {
                start++; // 만약 start 포인터를 움직였는데 더 큰 높이를 찾았을 경우
            } else {
                end--; // 만약 end 포인터의 높이가 더 작거나 같으면 왼쪽으로
            }
        }

        return max;
    }
}