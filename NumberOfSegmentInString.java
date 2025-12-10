public class NumberOfSegmentInString {

    static class Solution {
        public int countSegments(String s) {
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')) {
                    count++;
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.countSegments("Hello, my name is John")); // 5
        System.out.println(sol.countSegments("    ")); // 0
        System.out.println(sol.countSegments("a")); // 1
    }
}
