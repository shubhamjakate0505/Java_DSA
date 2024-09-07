import java.util.*;

public class Ques {
    static class Node {
        Node Children[] = new Node[26]; // children data
        boolean eow = false; // end of word

        Node() {
            for (int i = 0; i < 26; i++) {
                Children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) { // O(L)
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr.Children[idx] == null) {
                curr.Children[idx] = new Node();
            }
            curr = curr.Children[idx];
        }
        curr.eow = true;
    }

    public static boolean search(String key) {
        Node curr = root;
        for (int level = 0; level < key.length(); level++) {
            int idx = key.charAt(level) - 'a';
            if (curr.Children[idx] == null) {
                return false;
            }
            curr = curr.Children[idx];
        }
        return curr.eow;
    }

    public static String ans = "";

    public static void longestword(Node root, StringBuilder temp) {
        if (root == null) {
            return;
        }

        // Explore each child
        for (int i = 0; i < 26; i++) {
            if (root.Children[i] != null && root.Children[i].eow) { // Check if the child exists and is end of a word
                char ch = (char) (i + 'a'); // Get the character
                temp.append(ch); // Add the character to the current word

                // Only update answer if it's end of a word
                if (root.Children[i].eow && temp.length() > ans.length()) { 
                    ans = temp.toString();
                }

                // Recursively go deeper to find the longest word
                longestword(root.Children[i], temp);

                // Backtrack to explore other branches
                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }

    public static void main(String args[]) {
        String arr[] = { "a", "banana", "app", "appl", "apply", "apple" };

        for (String word : arr) {
            insert(word);
        }

        longestword(root, new StringBuilder(""));
        System.out.println("Longest Word: " + ans);
    }
}
