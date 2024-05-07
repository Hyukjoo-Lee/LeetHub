```
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

            [해쉬맵 / 정렬 사용 (시간복잡도 nlogn)]
            
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
	
class Solution {
    public String getSignature(String s) {
        /**
            [해쉬맵 / 레터 카운팅 사용 (시간복잡도logn)]

            시간 되면 직접 구현 해보기 - solution 참고하여 작성함

            각 문자열에 대해 문자의 빈도 수를 카운팅

            'aabb'는 각 문자 'a', 'b'가 두 번씩 나타나므로 카운트는 {a: 2, b: 2}가 됩니다.

            이 카운트를 바탕으로 각 문자열의 고유한 식별자(예: "2a2b" 형식)를 생성합니다.

            이 식별자를 해시맵의 키로 사용하고, 원본 문자열을 해당 키의 값으로 하는 리스트에 추가합니다.

            마지막으로, 해시맵의 모든 값을 모아 반환합니다.
         */

        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                sb.append((char) ('a' + i)).append(count[i]);
            }
        }
        return sb.toString();
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> groups = new HashMap<>();

        for (String s : strs) {
            groups.computeIfAbsent(getSignature(s), k -> new ArrayList<>()).add(s);
        }

        result.addAll(groups.values());

        return result;
    }
}
```

Constraints:

1 <= strs.length <= 104
0 <= strs[i].length <= 100
strs[i] consists of lowercase English letters.

1. **정렬 방식의 고려 사항**:
   - 문자열의 최대 길이는 100이며, 평균적인 문자열 길이가 짧은 경우 정렬은 매우 효율적입니다. 
   - 따라서 10,000개의 문자열을 정렬하는 것도 현대적인 컴퓨터에서는 비교적 빠르게 처리할 수 있습니다.

2. **문자 카운트 방식의 고려 사항**:
   - 문자열 길이의 최대가 100이므로, 이 방법 역시 효율적입니다.
   - 그러나 오버헤드가 있을 수 있으며, 문자열이 짧을 경우 이 오버헤드가 더욱 두드러질 수 있습니다.

**결론**:
- 문자열의 평균 길이가 짧다면, 정렬 방식은 굉장히 빠른 처리 속도를 보일 수 있습니다.
- 문자 카운트 방식은 일관된 O(n) 시간 복잡도를 제공하지만, 실제 구현에서는 해시 키 생성과 메모리 사용에 대한 고려가 필요합니다.

 문자열의 평균 길이가 매우 짧다면 정렬 방식이 더 우수할 수 있으며, 문자열의 길이가 비교적 길거나 문자열 수가 많다면 문자 카운트 방식이 더 나을 수 있습니다.
