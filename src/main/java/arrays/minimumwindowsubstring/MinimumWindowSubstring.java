package arrays.minimumwindowsubstring;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        if(s == null || t == null) return "";

        String res = "";

        int[] letterCount = new int[128];
        int left = 0, count = 0, minLen = Integer.MAX_VALUE;

        for(char c: t.toCharArray()){
            ++letterCount[c];
        }

        for(int right = 0; right < s.length(); ++right){
            if(--letterCount[s.charAt(right)] >= 0) ++count;

            while(count == t.length()){
                if(minLen > right - left + 1){
                    minLen = right - left + 1;
                    res = s.substring(left,right+1);
                }

                if(++letterCount[s.charAt(left)] > 0){
                    --count;
                }
                ++left;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        MinimumWindowSubstring minimumWindowSubstring = new MinimumWindowSubstring();
        System.out.println(minimumWindowSubstring.minWindow("ADOBECODEBANC","ABC"));
    }
}
