class Solution {
    public int lengthOfLongestSubstring(String s) {
        /**
            문자열이 주어지면 가장 긴 substring, 부분 문자열의 길이를 반환하는 문제입니다.
            여기서 부문 문자열이란 반복되지 않는 글자 수의 조합을 의미 합니다.

            예를 들어

            "pwwkew" 가 주어진 다면
            wke 이므로 이 substring 의 길이인 3이 반환되어야 합니다. 
            
            여기서 pkwe 는 subsequence 이기 때문에 wke 의 길이가 정답입니다.

            subsequence는 부분수열로, 연속되지 않은 문자열도 고려하지만 
            substring은 문자열로, 연속된 문자열을 나타냅니다.
            
            Set 을 사용하여 중복을 제거하고 set 의 길이를 반환한다면 부분수열의 길이를 반환하기 때문에
            다른 방법을 사용해야 겠다 생각했습니다.

            어떤 방법이 적합할지 고민 좀 해보겠습니다.


            가능한 모든 substring 을 생성하면서 maxLength 를 업데이트 하는 방법..?
            
         */

        
        int maxLength = 0;
        // 문자의 마지막 인덱스를 저장할 해시맵
        Map<Character, Integer> charMap = new HashMap<>();
        // 현재 부분 문자열의 시작 인덱스
        int start = 0;
        // 문자열의 각 문자를 순회
        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            // 현재 문자가 이미 맵에 있다면
            if (charMap.containsKey(currentChar)) {
                // 현재 부분 문자열의 시작 인덱스를 업데이트
                start = Math.max(start, charMap.get(currentChar) + 1);
            }

            // 현재 문자의 인덱스를 해시맵에 저장
            charMap.put(currentChar, end);

            // 현재 부분 문자열의 길이를 계산하고 최대 길이를 업데이트
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}