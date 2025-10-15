import java.util.*;

class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        int number = 0;
        int sign = 1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                number = number * 10 + (c - '0');
            } else if (c == '+') {
                result += sign * number;
                number = 0;
                sign = 1;
            } else if (c == '-') {
                result += sign * number;
                number = 0;
                sign = -1;
            } else if (c == '(') {
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            } else if (c == ')') {
                result += sign * number;
                number = 0;
                result *= stack.pop();     // pop sign
                result += stack.pop();     // pop previous result
            }
        }

        result += sign * number;  // add the last number
        return result;
    }
}

public class BasicCalculator {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.calculate("1 + 1"));               // 2
        System.out.println(sol.calculate(" 2-1 + 2 "));           // 3
        System.out.println(sol.calculate("(1+(4+5+2)-3)+(6+8)")); // 23
    }
}
