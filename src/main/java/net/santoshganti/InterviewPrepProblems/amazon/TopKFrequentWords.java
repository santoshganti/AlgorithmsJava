package net.santoshganti.InterviewPrepProblems.amazon;

import java.util.*;

public class TopKFrequentWords {
    public List<String> topKFrequent(String[] words, int k) {

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> !Objects.equals(map.get(b), map.get(a)) ? map.get(b) - map.get(a) : a.compareTo(b));
        pq.addAll(map.keySet());
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            ans.add(pq.poll());
        }
        return ans;
    }
}