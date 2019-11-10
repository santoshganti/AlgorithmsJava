package trie;

import java.util.HashMap;
import java.util.Map;

public class Trie {
    private final TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    //insert
    public void insert(String word) {
        if (word != null) {
            TrieNode current = root;
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                TrieNode node = current.children.get(ch);
                if (node == null) {
                    node = new TrieNode();
                    current.children.put(ch, node);
                }
                current = node;
            }
            current.endOfWord = true;
            System.out.println("Successfull inserted " + word + " in trie!");
        }
    }

    //search a word
    public boolean search(String word) {
        if (word == null) return false;

        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if (node == null) {
                System.out.println("Word: " + word + " doesn't exists in the trie! ");
                return false;
            }
            current = node;
        }

        if (current.endOfWord) {
            System.out.println("Word: " + word + " exits in the trie");
        } else {
            System.out.println("Word: " + word + " does not exits in the trie but this is a prefix of another node");
        }
        return current.endOfWord;
    }

    //delete


}

