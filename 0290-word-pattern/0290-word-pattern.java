public class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] strArr = s.split(" ");
        char[] chArr = pattern.toCharArray();
        if(chArr.length != strArr.length) {
            return false;
        }

        Map<Character, String> map = new HashMap<>();

        for(int i = 0; i < strArr.length; i++) {
            char currentChar = chArr[i];
            String currentWord = strArr[i];

            if(map.containsKey(currentChar)) {
                if(!map.get(currentChar).equals(currentWord)) {
                    return false;
                }
            } else {
                if (map.containsValue(currentWord)) {
                    return false;
                }
                map.put(currentChar, currentWord);
            }
        }

        return true;
    }
}