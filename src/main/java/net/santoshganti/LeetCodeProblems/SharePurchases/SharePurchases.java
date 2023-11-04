package net.santoshganti.LeetCodeProblems.SharePurchases;

public class SharePurchases {

    public static void main(String[] args) {
        String s = "ABCCBA";
        System.out.println(analyzeInvestments(s));
    }

    public static long analyzeInvestments(String s) {
        int n = s.length();
        long count = 0;

        if (n < 3) {
            return 0;
        }

        int start = 0, end = start; // sliding window 'start' is start index 'end' is end index of the current window
        int aCount = 0, bCount = 0, cCount = 0; //counters of A,B,C shares respectively

        while (start <= n - 3 && end <= n - 1) {
            if (s.charAt(end) == 'A')
                aCount++;
            else if (s.charAt(end) == 'B')
                bCount++;
            else if (s.charAt(end) == 'C')
                cCount++;

            while (aCount > 0 && bCount > 0 && cCount > 0 && start <= n - 3 && end <= n - 1) {
                // suppose, [ABC]BCA  here total 4 possible combinations are ABC,ABCB, ABCBC, BACBCA. (n-end = 6-2=4)
                count += (n - end);
                start++;

                if (s.charAt(start - 1) == 'A')
                    aCount--;
                else if (s.charAt(start - 1) == 'B')
                    bCount--;
                else if (s.charAt(start - 1) == 'C')
                    cCount--;
            }
            end++;
        }

        return count;
    }
}
