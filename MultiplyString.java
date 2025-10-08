class Solution {
    public String multiply(String num1, String num2) {
        // if any number is 0
        if (num1.equals("0") || num2.equals("0")) return "0";

        int n1 = num1.length();
        int n2 = num2.length();
        int[] result = new int[n1 + n2];

        // multiply each digit (from right to left)
        for (int i = n1 - 1; i >= 0; i--) {
            for (int j = n2 - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = mul + result[i + j + 1];

                result[i + j + 1] = sum % 10;   // store unit digit
                result[i + j] += sum / 10;      // carry
            }
        }

        // convert result array to string
        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (!(sb.length() == 0 && num == 0)) { // skip leading zeros
                sb.append(num);
            }
        }

        return sb.toString();
    }
}
public class MultiplyString {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.multiply("123", "45")); // Output: "5535"
        System.out.println(sol.multiply("9", "9"));    // Output: "81"
        System.out.println(sol.multiply("0", "123"));  // Output: "0"
    }
}
