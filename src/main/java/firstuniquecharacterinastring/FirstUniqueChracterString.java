package firstuniquecharacterinastring;

import java.util.HashMap;

public class FirstUniqueChracterString {
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> hashmap = new HashMap<>();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            hashmap.put(c, hashmap.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < n; i++) {
            if (hashmap.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }
}
