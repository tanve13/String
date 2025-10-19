public class ReverseVowels {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;
        String vowels = "aeiouAEIOU";

        while (left < right) {
            // Move left pointer until a vowel is found
            while (left < right && vowels.indexOf(chars[left]) == -1) {
                left++;
            }
            // Move right pointer until a vowel is found
            while (left < right && vowels.indexOf(chars[right]) == -1) {
                right--;
            }

            // Swap the vowels
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            // Move both pointers
            left++;
            right--;
        }

        return new String(chars);
    }

    // ✅ Main method to test
    public static void main(String[] args) {
        ReverseVowels sol = new ReverseVowels();

        System.out.println(sol.reverseVowels("hello"));     // Output: holle
        System.out.println(sol.reverseVowels("leetcode"));  // Output: leotcede
        System.out.println(sol.reverseVowels("aA"));        // Output: Aa
    }
}
