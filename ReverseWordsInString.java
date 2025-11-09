import java.util.*;

public class ReverseWordsInString {

    static class Solution {
        public String reverseWords(String s) {
            // Step 1: Trim and split by spaces (regex handles multiple spaces)
            String[] words = s.trim().split("\\s+");

            // Step 2: Reverse the words array
            Collections.reverse(Arrays.asList(words));

            // Step 3: Join them with a single space
            return String.join(" ", words);
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String s1 = "  the sky  is blue  ";
        String s2 = "  hello world  ";
        String s3 = "a good   example";

        System.out.println("Input: \"" + s1 + "\"");
        System.out.println("Output: \"" + sol.reverseWords(s1) + "\"\n");

        System.out.println("Input: \"" + s2 + "\"");
        System.out.println("Output: \"" + sol.reverseWords(s2) + "\"\n");

        System.out.println("Input: \"" + s3 + "\"");
        System.out.println("Output: \"" + sol.reverseWords(s3) + "\"");
    }
}
