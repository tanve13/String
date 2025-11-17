public class ConvertNumberToHexaDecimal {

    static class Solution {
        public String toHex(int num) {
            if (num == 0) return "0";

            char[] map = "0123456789abcdef".toCharArray();
            StringBuilder sb = new StringBuilder();

            while (num != 0 && sb.length() < 8) {  // max 8 hex chars for 32-bit
                sb.append(map[num & 15]);         // take last 4 bits
                num >>>= 4;                       // unsigned right shift
            }

            return sb.reverse().toString();
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int n1 = 26;
        int n2 = -1;
        int n3 = 0;
        int n4 = 123456;

        System.out.println("26 -> " + sol.toHex(n1));        // 1a
        System.out.println("-1 -> " + sol.toHex(n2));        // ffffffff
        System.out.println("0 -> " + sol.toHex(n3));         // 0
        System.out.println("123456 -> " + sol.toHex(n4));    // 1e240
    }
}
