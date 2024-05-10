class Solution {
    public boolean isAnagram(String s, String t) {
        /**
            두 개의 단어가 anagram 이면 true, 아니면 false 를 리턴하는 문제입니다.

            첫 번째 접근방법은 단어들을 알파벳 순서로 정렬하고 단어로 다시 만들어서 같은지 비교하는 방법입니다.  
            
            정렬 알고리즘이 사용되기 때문에 시간 복잡도는 N O logN 입니다.
            (입력 문자열의 길이 N)
         */
        char[] chS = s.toCharArray();
        char[] chT = t.toCharArray();
        
        Arrays.sort(chS);
        Arrays.sort(chT);

        s = new String(chS);
        t = new String(chT);

        return s.equals(t);
    }
}