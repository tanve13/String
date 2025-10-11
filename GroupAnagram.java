import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            // Sort the string to use as a key
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            // Add the original word under its sorted key
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }

        // Return all grouped anagrams
        return new ArrayList<>(map.values());
    }
}

public class GroupAnagram {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] words = {"eat","tea","tan","ate","nat","bat"};

        List<List<String>> result = sol.groupAnagrams(words);
        System.out.println(result);
    }
}
