```java
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


class Solution {
    public boolean isAnagram(String s, String t) {
        /**
            다른 방법으로 HashMap 을 사용해서 단어의 각 character 들을 카운트하고
            
            key-value 로 저장해서

            같은지 확인 하는 방법이 있습니다.
            
            "시간 복잡도는 O(N) 인데 왜 처리시간이 느릴까?" 에 대한 고민과 구글링 결과

            HashMap을 구축하고 관리하는 데는 메모리 및 처리에 대한 오버헤드 때문에

            처리 시간이 더 느리다는 결론 입니다.
         */
            Map<Character, Integer> mapS = new HashMap<>();
            Map<Character, Integer> mapT = new HashMap<>();

            for(char ch : s.toCharArray()) {
                mapS.put(ch, mapS.getOrDefault(ch, 0) + 1);
            }

            for(char ch : t.toCharArray()) {
                mapT.put(ch, mapT.getOrDefault(ch, 0) + 1);
            }

            if(mapS.equals(mapT)) {
                return true;
            }

            return false;
    }
}
```
