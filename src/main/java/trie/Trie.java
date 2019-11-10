package trie;

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
    // Delete word from Trie
    public void delete(String word) {
        if (search(word)) {
            delete(root, word, 0);
        }
    }

    public boolean delete(TrieNode parentNode, String word, int index) {
        //CASE 1 - some other word's prefix is same as the prefix of this word (BCDE, BCKG)
        //CASE 2 - We are a the last character of this word and this word is a prefix of some other word (BCDE, BCDEFG)
        //CASE 3 - Some other word is a prefix of this word (BCDE, BC)
        //CASE 4 - No one is dependent on this word (BCDE, BCDE)

        char ch = word.charAt(index);
        TrieNode currentNode = parentNode.children.get(ch);

        boolean shouldDeleteNode;

        if (currentNode.children.size() > 1) {
            System.out.println("Entering case 1");
            delete(currentNode, word, index + 1);
            return false;
        }

        if (index == word.length() - 1) {
            System.out.println("Entering case 2");
            if (currentNode.children.size() >= 1) {
                currentNode.endOfWord = false;
                return false;
            } else {
                System.out.println("Character " + ch + " has no dependency, hence deleting it from last");
                parentNode.children.remove(ch);
                return true;
            }
        }

        if (currentNode.endOfWord == true) {
            System.out.println("Entering case 3");
            delete(currentNode, word, index + 1);
            return false;
        }

        System.out.println("Entering case 4");
        shouldDeleteNode = delete(currentNode, word, index + 1);
        if (shouldDeleteNode == true) {
            System.out.println("Character " + ch + " has no dependency, hence deleting it");
            parentNode.children.remove(ch);
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Trie t = new Trie();

        //CASE#1
        t.insert("bcde");
        t.insert("bckg");
        t.delete("bcde");
        t.search("bcde");
        t.search("bckg");


		/*//CASE#2
		t.insert("bcde");
		t.insert("bcdefg");
		t.delete("bcde");
		t.search("bcde");
		t.search("bcdefg");*/


		/*//CASE#3
		t.insert("bcde");
		t.insert("bc");
		t.delete("bcde");
		t.search("bcde");
		t.search("bcde");
		t.search("bc");
		t.search("b");*/


		/*//CASE#4
		t.insert("bcde");
		t.delete("bcde");
		t.search("bcde");*/
    }
}

