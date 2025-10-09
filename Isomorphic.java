class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) != t.indexOf(t.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
public class Isomorphic {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String s1 = "egg";
        String t1 = "add";
        System.out.println(sol.isIsomorphic(s1, t1)); // true

        String s2 = "foo";
        String t2 = "bar";
        System.out.println(sol.isIsomorphic(s2, t2)); // false

        String s3 = "paper";
        String t3 = "title";
        System.out.println(sol.isIsomorphic(s3, t3)); // true
    }
}