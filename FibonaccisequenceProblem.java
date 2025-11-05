public class FibonaccisequenceProblem {

    static class Solution {
        public int climbStairs(int n) {
            if (n <= 2) return n;

            int first = 1, second = 2;
            for (int i = 3; i <= n; i++) {
                int third = first + second;
                first = second;
                second = third;
            }
            return second;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int n1 = 2;
        int n2 = 3;
        int n3 = 5;

        System.out.println("Number of ways to climb " + n1 + " stairs: " + sol.climbStairs(n1));
        System.out.println("Number of ways to climb " + n2 + " stairs: " + sol.climbStairs(n2));
        System.out.println("Number of ways to climb " + n3 + " stairs: " + sol.climbStairs(n3));
    }
}
