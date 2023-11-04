package net.santoshganti.InterviewPrepProblems.amazon;

import java.util.Collections;
import java.util.List;

public class MaxQualityChannel {
    public static long maximumQuality(List<Integer> packets, int channels) {
        // Write your code here
        int n = packets.size();

        double answer = 0;
        if (n == channels) {
            for (int i = 0; i < n; i++) {
                answer += packets.get(i);
            }
            return (long) answer;
        }

        Collections.sort(packets);

        for (int i = n - channels + 1; i < n; i++) {
            answer += packets.get(i);
        }

        n = n - channels;
        if (n % 2 == 0) {
            // odd
            answer += packets.get(n / 2);
        } else {
            //even
            double value = packets.get(n / 2) + packets.get((n / 2) + 1);
            answer += value / 2;
        }

        return (long) Math.ceil(answer);
    }
}