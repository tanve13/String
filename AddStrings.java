public class AddStrings {

    static class Solution {
        public String addStrings(String num1, String num2) {
            StringBuilder sb = new StringBuilder();

            int i = num1.length() - 1;
            int j = num2.length() - 1;
            int carry = 0;

            while (i >= 0 || j >= 0 || carry > 0) {
                int x = (i >= 0) ? num1.charAt(i) - '0' : 0;
                int y = (j >= 0) ? num2.charAt(j) - '0' : 0;
                int sum = x + y + carry;

                sb.append(sum % 10);
                carry = sum / 10;

                i--;
                j--;
            }

            return sb.reverse().toString();
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String num1 = "456";
        String num2 = "77";
        System.out.println("Sum of " + num1 + " + " + num2 + " = " + sol.addStrings(num1, num2));

        num1 = "11";
        num2 = "123";
        System.out.println("Sum of " + num1 + " + " + num2 + " = " + sol.addStrings(num1, num2));

        num1 = "0";
        num2 = "0";
        System.out.println("Sum of " + num1 + " + " + num2 + " = " + sol.addStrings(num1, num2));
    }
}
