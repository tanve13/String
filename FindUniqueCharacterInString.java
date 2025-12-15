public class FindUniqueCharacterInString {

    static class Solution {
        public int firstUniqChar(String s) {
            int[] count = new int[26];

            // Step 1: Count frequency of each character
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            // Step 2: Find first character with frequency 1
            for (int i = 0; i < s.length(); i++) {
                if (count[s.charAt(i) - 'a'] == 1) {
                    return i;
                }
            }

            return -1; // No unique character
        }
    }
 public static void main(String[] args) {
        Solution sol = new Solution();

        String s1 = "leetcode";
        String s2 = "loveleetcode";
        String s3 = "aabb";

        System.out.println("First unique char index in \"" + s1 + "\": " + sol.firstUniqChar(s1));
        System.out.println("First unique char index in \"" + s2 + "\": " + sol.firstUniqChar(s2));
        System.out.println("First unique char index in \"" + s3 + "\": " + sol.firstUniqChar(s3));
    }
}
