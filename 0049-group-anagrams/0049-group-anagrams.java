class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        /**
            group the anagrams together into list
            and return the list
            
            strs = ["eat","tea","hih","ihh"]
            list = ["eat, "tea"], ["hih", "ihh"]
            Map<String, List<String>>
            we need to sort the each strs 
            map strs[i]
            aet : [eat]
            if(map.containsKey(sortedStr)) {
                // get key, add value 
                map.get(sortedStr).add(str[i])
            }

            return map.getValues()?
            1 [e:1] [a:1] [t:1]
            2 [h:2] [i:1]
            3 [h:2] [i:1]

            how to detect 0 = 1
            and 2 = 3 ?
         */

        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs) {
            char[] chArr = str.toCharArray();
            Arrays.sort(chArr);
            String sortedStr = new String(chArr);
            if(!map.containsKey(sortedStr)) {
                // how to create a new ArrayList and add the new list?
                map.put(sortedStr, new ArrayList<>());
                map.get(sortedStr).add(str);
            } else {
                map.get(sortedStr).add(str);
            }
        }
        
        // how to return the multiple values in the map...
        // return map.getValues();
        return new ArrayList<>(map.values());









    }
}