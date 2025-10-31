public class BasicCalculatorII {

    static class Solution {
        public int calculate(String s) {
            if (s == null || s.isEmpty()) return 0;

            int n = s.length();
            java.util.Stack<Integer> stack = new java.util.Stack<>();
            int num = 0;
            char sign = '+'; // start with '+'

            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);

                // Build current number
                if (Character.isDigit(c)) {
                    num = num * 10 + (c - '0');
                }

                // If it's an operator or last character
                if ((!Character.isDigit(c) && c != ' ') || i == n - 1) {
                    if (sign == '+') {
                        stack.push(num);
                    } else if (sign == '-') {
                        stack.push(-num);
                    } else if (sign == '*') {
                        stack.push(stack.pop() * num);
                    } else if (sign == '/') {
                        stack.push(stack.pop() / num);
                    }

                    // Update operator
                    sign = c;
                    num = 0;
                }
            }

            // Sum up all results in the stack
            int result = 0;
            for (int val : stack) result += val;
            return result;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String s1 = "3+2*2";
        String s2 = " 3/2 ";
        String s3 = " 3+5 / 2 ";

        System.out.println("Input: \"" + s1 + "\"  => Output: " + sol.calculate(s1));
        System.out.println("Input: \"" + s2 + "\"  => Output: " + sol.calculate(s2));
        System.out.println("Input: \"" + s3 + "\"  => Output: " + sol.calculate(s3));
    }
}
