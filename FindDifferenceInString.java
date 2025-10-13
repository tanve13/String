class Solution {
    public char findTheDifference(String s, String t) {
        int sumS = 0, sumT = 0;

        for (char c : s.toCharArray()) sumS += c;
        for (char c : t.toCharArray()) sumT += c;

        return (char)(sumT - sumS);
    }
}
class FindDifferenceInString {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.findTheDifference("abcd", "abcde")); // e
        System.out.println(sol.findTheDifference("", "y"));         // y
    }
}
