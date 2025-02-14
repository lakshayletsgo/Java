import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ReLeetCode_96 {
    public static void main(String[] args) {

    }
    private class Trie{
        Trie links[] = new Trie[26];
        String word = null;
    }
    public List<String> findWords(char[][] board, String[] words) {
        int m = board.length;
        int n = board[0].length;
        HashSet<String> res = new HashSet<>();
        Trie root = buildTrie(words);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dfs(i,j,root,board,res);
            }
        }
        return new ArrayList<String>(res);
    }

    private Trie buildTrie(String[] words) {
        Trie node= new Trie();
        for (String w:words){
            Trie curr = node;
            for (char ch:w.toCharArray()){
                if (curr.links[ch-'a']==null){
                    curr.links[ch-'a']=new Trie();
                }
                curr = curr.links[ch-'a'];

            }
            curr.word = w;
        }

        return node;
    }

    private void dfs(int i, int j, Trie root, char[][] board, HashSet<String> res) {
        if (i<0||i>=board.length||j<0||j>=board[0].length)return;
        char ch = board[i][j];
        if (ch=='#'||root.links[ch-'a']==null)return;
        root = root.links[ch-'a'];
        if (root.word!=null) res.add(root.word);
        board[i][j] ='#';
        dfs(i,j-1,root,board,res);
        dfs(i,j+1,root,board,res);
        dfs(i-1,j,root,board,res);
        dfs(i+1,j,root,board,res);

        board[i][j] = ch;


    }
}
