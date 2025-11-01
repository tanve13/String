public class IsSubsequence {
    static class Solution {
        public boolean isSubsequence(String s, String t) {
            int i = 0, j = 0;

            while (i < s.length() && j < t.length()) {
                if (s.charAt(i) == t.charAt(j)) {
                    i++; // move pointer in s
                }
                j++; // always move pointer in t
            }

            return i == s.length(); // true if all chars of s are found in t
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String s1 = "abc", t1 = "ahbgdc";
        String s2 = "axc", t2 = "ahbgdc";

        System.out.println("Input: s = \"" + s1 + "\", t = \"" + t1 + "\" → " + sol.isSubsequence(s1, t1));
        System.out.println("Input: s = \"" + s2 + "\", t = \"" + t2 + "\" → " + sol.isSubsequence(s2, t2));
    }
}
