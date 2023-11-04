package amazon;

public class CountBinarySubStrings {
    public int countBinarySubstrings(String s) {
        int current = 1;
        int solution = 0;
        int previous = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                current++;
            } else {
                solution += Math.min(current, previous);
                previous = current;
                current = 1;
            }
        }
        return solution + Math.min(current, previous);
    }
}