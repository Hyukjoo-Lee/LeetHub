class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        /**
            정수 타입의 nums 어레이와 정수 k가 주어지면 
            가장 자주 빈번하게 존재하는 정수 k개를 리턴하는 문제입니다.

            어떠한 순서로든 리턴할 수 있습니다.

            key-value 저장 형식은 HashMap 을 사용할 수 있을 것 같습니다.

            key로 각 고유한 정수를 저장하고
            value로 빈번도를 저장합니다.

            예로써, [1,1,1,2,2,3] 에서는
            [1:3] [2:2] [3:1] 이 저장 될 것입니다.

            예시는 이미 sort 가 되있지만 map 의 빈번도를 정렬 해야합니다.
            
            k 를 감소시키며 k == 0 이 될때까지 루프를 돌려 새로운 어레이에 값을 저장합니다.

            마지막으로 값이 저장된 새로운 어레이를 리턴합니다. 

            정렬을 위해 ArrayList를 사용한 이유는 몇 가지 존재합니다.

            첫번 째, 맵은 정렬 순서를 유지 하지 않습니다.  
            두번 째, 정렬 가능한 자료구조가 필요한데 ArrayList 는 정렬 알고리즘이 적용 될 수 있고 순서대로 데이터를 저장합니다. 
            세번 째, Comparator를 통해 간편하게 정렬하는 로직이 있습니다. 람다 함수 (a,b) -> b.getValue() - a.getValue() 를 사용하면 두 엔트리 a,b 의 값을 손쉽게 비교하여 내림차순으로 정렬 할 수 있습니다.

         */


         Map<Integer,Integer> map = new HashMap<>();
        
         // 정답이 될 길이가 k 인 어레이를 선언
         int[] answer= new int[k];

         // map 에 key-value 저장
         for(int num : nums) {
            map.put(num ,map.getOrDefault(num,0)+1);
         }
         
         // sort
         List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
         list.sort((a,b) -> b.getValue() - a.getValue());
        
         int i = 0;
         while(k != 0) {
            answer[i] = list.get(i).getKey();
            k--;
            i++;
         }
         
         return answer;
    }
}