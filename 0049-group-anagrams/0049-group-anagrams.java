class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        /**
            배열에 내 존재하는 anagrams을 새로운 리스트에 그룹으로 묶어서 리턴하는 문제입니다.
            반환되는 순서는 어떤 순서라도 상관 없습니다.

            아나그램이란 한 레터나 구절의 글자를 재배열하여 다른 단어나 구절로 형성하는 것을 의미합니다.
            모든 레터를 정확히 한 번씩만 사용합니다.

            예를들어, "listen"과 "silent"를 보면
            
            같은 레터 'l', 'i', 's', 't', 'e', 'n'을 사용하여 다르게 배열 가능합니다.
            ==> 서로 아나그램 관계가 있다고 합니다.

            1. 해쉬맵 / 정렬 사용 (시간복잡도 nlogn)
            
            'eat', 'tea' 를 정렬하면 모두 'aet'가 됩니다.

            정렬된 문자열을 키로 사용하여 해시맵에 저장하고
            
            원래의 문자열들은 해시맵의 해당 키에 대한 값으로 리스트에 추가합니다.

            마지막으로, 해시맵의 모든 값을 모아 반환합니다.
         */

        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs) {
            // string 정렬
            char[] chArr = str.toCharArray();
            Arrays.sort(chArr);

            // System.out.println(chArr);
            String sortedStr = String.valueOf(chArr);

            if(!map.containsKey(sortedStr)) {
				 // 해시맵에 정렬된 문자열을 키로 하여 원본 문자열 리스트를 저장
				 map.put(sortedStr, new ArrayList<>());
			 }
             // 해시맵에서 키 검색하여 해당 값인 ArrayList 에 str 저장
             map.get(sortedStr).add(str);
        }
        // 해시맵의 모든 값을 모아 반환
        return new ArrayList<>(map.values());
    }
}