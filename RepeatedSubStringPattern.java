public class RepeatedSubStringPattern {

    static class Solution {
        public boolean repeatedSubstringPattern(String s) {
            int n = s.length();
            int[] lps = new int[n];

            for (int i = 1, len = 0; i < n; ) {
                if (s.charAt(i) == s.charAt(len)) {
                    lps[i++] = ++len;
                } else if (len > 0) {
                    len = lps[len - 1];
                } else {
                    lps[i++] = 0;
                }
            }

            int length = lps[n - 1];
            return (length > 0 && n % (n - length) == 0);
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.repeatedSubstringPattern("abab")); // true
        System.out.println(sol.repeatedSubstringPattern("aba"));  // false
    }
}
