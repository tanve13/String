
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26]; // only lowercase English letters

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int c : count) {
            if (c != 0) return false;
        }

        return true;
    }
}

public class ValidAnagram {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.isAnagram("anagram", "nagaram")); // ✅ true
        System.out.println(sol.isAnagram("rat", "car")); // false
    }
}
