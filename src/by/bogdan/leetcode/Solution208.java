package by.bogdan.leetcode;

/**
 * Solution for 'Implement Trie (Prefix Tree)' algorithmic problem.
 * Implement a trie with insert, search, and startsWith methods.
 * You may assume that all inputs are consist of lowercase letters a-z.
 * @see <a href="https://leetcode.com/problems/implement-trie-prefix-tree">208. Implement Trie (Prefix Tree) on leetcode.com</a>
 */
public class Solution208 {
    private final static int FIRST_CHAR_VALUE = 'a';
    private final static int DEFAULT_MAX_CHILDREN_SIZE = 'z' - 'a' + 1;
    private TrieNode root;

    private class TrieNode {
        private TrieNode[] children;
        private boolean isValue;

        public TrieNode() {
            children = new TrieNode[DEFAULT_MAX_CHILDREN_SIZE];
        }
    }

    /* Initialize your data structure here. */
    public Solution208() {
        root = new TrieNode();
    }

    /* Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode node = root;
        for (char c: word.toCharArray()) {
            int idx = c - FIRST_CHAR_VALUE;
            if (node.children[idx] == null) {
                node.children[idx] = new TrieNode();
            }
            node = node.children[idx];
        }
        node.isValue = true;
    }

    /* Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode node = root;
        int i = 0;
        while (node != null && i < word.length()) {
            node = node.children[word.charAt(i) - FIRST_CHAR_VALUE];
            i++;
        }
        return i == word.length() && node != null && node.isValue == true;
    }

    /* Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        int i = 0;
        while (node != null && i < prefix.length()) {
            node = node.children[prefix.charAt(i) - FIRST_CHAR_VALUE];
            i++;
        }
        return i == prefix.length() && node != null;
    }
}
