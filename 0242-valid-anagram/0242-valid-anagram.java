class Solution {
    public boolean isAnagram(String s, String t) {
        char[] chS = s.toCharArray();
        char[] chT = t.toCharArray();
        
        Arrays.sort(chS);
        Arrays.sort(chT);

        s = new String(chS);
        t = new String(chT);

        return s.equals(t);
    }
}