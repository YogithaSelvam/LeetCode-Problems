class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int max = 0;
        HashSet<Character> charSet = new HashSet<>();
        int l = 0;
        
        for (int r = 0; r < n; r++) {
            if (!charSet.contains(s.charAt(r))) {
                charSet.add(s.charAt(r));
                max = Math.max(max, r - l + 1);
            } else {
                while (charSet.contains(s.charAt(r))) {
                    charSet.remove(s.charAt(l));
                    l++;
                }
                charSet.add(s.charAt(r));
            }
        }
        
        return max;
    }
}