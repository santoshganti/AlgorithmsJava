package arrays.anagramm;

import java.util.Arrays;

public class Anagram {
    static int NO_OF_CHARS = 256;

    public boolean isAnagram(String s, String t) {
        // Create 2 count arrays and initialize
        // all values as 0
        int[] count1 = new int[NO_OF_CHARS];
        Arrays.fill(count1, 0);
        int[] count2 = new int[NO_OF_CHARS];
        Arrays.fill(count2, 0);
        int i;

        // For each character in input strings,
        // increment count in the corresponding
        // count array
        for (i = 0; i < s.length() && i < t.length();
             i++) {
            count1[s.charAt(i)]++;
            count2[t.charAt(i)]++;
        }

        // If both strings are of different length.
        // Removing this condition will make the program
        // fail for strings like "aaca" and "aca"
        if (s.length() != t.length())
            return false;

        // Compare count arrays
        for (i = 0; i < NO_OF_CHARS; i++)
            if (count1[i] != count2[i])
                return false;

        return true;
    }
}
