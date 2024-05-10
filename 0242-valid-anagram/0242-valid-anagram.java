class Solution {
    public boolean isAnagram(String s, String t) {
        /**
            다른 방법으로 HashMap 을 사용해서 단어의 각 character 들을 카운트하고
            
            key-value 로 저장해서

            같은지 확인 하는 방법이 있을 것 같습니다.
            
            시간 복잡도는 O(N) 인데 왜 처리시간이 느릴까? 에 대한 고민과 구글링 결과

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