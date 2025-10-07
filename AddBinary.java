class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry;

            if (i >= 0) sum += a.charAt(i--) - '0';  // convert '1'/'0' to integer
            if (j >= 0) sum += b.charAt(j--) - '0';

            result.append(sum % 2); // add current bit (0 or 1)
            carry = sum / 2;        // calculate carry
        }

        return result.reverse().toString(); // reverse to get correct order
    }
}
public class AddBinary{
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.addBinary("11", "1"));       // Output: 100
        System.out.println(sol.addBinary("1010", "1011"));  // Output: 10101
    }
}
