class Solution {
    public int lengthOfLastWord(String s) {
        /**
            remove the first and last spaces in s
            s = "fly me to the moon"
            charArr = {fly, me, to, the, moon}
            
            length - 1
         */
        s.trim();

        String[] strArr = s.split(" ");
        int answer = strArr[strArr.length -1].length();

        return answer;
    }
}