class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] mapS = new int[256];
        int[] mapT = new int[256];
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            if (mapS[sChars[i]] != mapT[tChars[i]]) {
                return false;
            }
            mapS[sChars[i]] = i + 1;
            mapT[tChars[i]] = i + 1;
        }
        return true;
    }
}