class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        /**
            Sort ? I do not understand why contains return false

            HashMap
            magazine
            "aab"
            "baa"
            [b:1, a:2]
            
            b
         */

        // char[] chArr = ransomNote.toCharArray();
        // char[] chArr2 = magazine.toCharArray();

        // Arrays.sort(chArr);
        // Arrays.sort(chArr2);

        // String sortedStr = new String(chArr);
        // String sortedStr2 = new String(chArr2);

        // System.out.println(sortedStr);
        // System.out.println(sortedStr2);

        // return sortedStr2.contains(sortedStr);

        Map<Character, Integer> map = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {

            if (!map.containsKey(c) || map.get(c) <= 0) {
                return false;
            }
            map.put(c, map.get(c) - 1);
        }

        return true;
    }
}