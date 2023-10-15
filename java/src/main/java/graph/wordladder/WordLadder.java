package graph.wordladder;

import javafx.util.Pair;

import java.util.*;

public class WordLadder {
    public static void main(String[] args) {
        String beiginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList("hot","dot","dog","lot","log","cog");

        int res = ladderLength(beiginWord,endWord,wordList);
        System.out.println(res);
    }
    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        //all words are of same length
        int L = beginWord.length();

        //Dict to hold combination of words that can be formed from any given word. By changing one letter at a time
        HashMap<String, ArrayList<String>> allComboDict = new HashMap<String, ArrayList<String>>();

        for (String word : wordList) {
            for (int i = 0; i < L; i++) {
                String newWord = word.substring(0, i) + '*' + word.substring(i + 1, L);
                ArrayList<String> transformations = allComboDict.getOrDefault(newWord, new ArrayList<String>());
                transformations.add(word);
                allComboDict.put(newWord, transformations);
            }
        }

        //Queue for BFS
        Queue<Pair<String, Integer>> Q = new LinkedList<>();
        Q.add(new Pair(beginWord, 1));

        //visited to make sure we don't repeat processing same word
        HashMap<String, Boolean> visited = new HashMap<String, Boolean>();
        visited.put(beginWord, true);

        while (!Q.isEmpty()) {
            Pair<String, Integer> node = Q.remove();
            String word = node.getKey();
            int level = node.getValue();

            for (int i = 0; i < L; i++) {
                String newWord = word.substring(0, i) + '*' + word.substring(i + 1, L);
                // Next states are all the words which share the same intermediate state.
                for (String adjacentWord : allComboDict.getOrDefault(newWord, new ArrayList<String>())) {
                    if (adjacentWord.equals(endWord)) {
                        return level + 1;
                    }

                    if (!visited.containsKey(adjacentWord)) {
                        visited.put(adjacentWord, true);
                        Q.add(new Pair(adjacentWord, level + 1));
                    }
                }
            }
        }
        return 0;
    }
}
