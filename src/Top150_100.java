import java.util.*;
public class Top150_100 {
    private class TrieNode{
        TrieNode []next = new TrieNode[26];
        String val;
    }

    public List<String> findWords(char[][] board, String[] words) {
        List<String> ans = new ArrayList<>();
        TrieNode root = buildTree(words);
        for (int i=0;i<board.length;i++){
            for (int j=0;j<board[0].length;j++)
                dfs(board,i,j,root,ans);
        }
        return ans;
    }

    private TrieNode buildTree(String[] words) {
        TrieNode root = new TrieNode();
        for (String w:words){
            TrieNode p = root;
            for (char i:w.toCharArray()){
                int temp = i-'a';
                if (p.next[temp]==null)p.next[temp] = new TrieNode();
                p= p.next[temp];
            }
            p.val = w;
        }
        return root;
    }

    private void dfs(char[][]board,int i,int j,TrieNode root,List<String>res){
        char c = board[i][j];
        if (c=='#'|| root.next[c-'a']==null)return;
        root = root.next[c-'a'];
        if (root.val!=null){
            res.add(root.val);
            root.val = null;
        }
        board[i][j] = '#';
        if (i>0)dfs(board,i-1,j,root,res);
        if (j>0)dfs(board,i,j-1,root,res);
        if (i<board.length-1)dfs(board,i+1,j,root,res);
        if (j<board[0].length-1)dfs(board,i,j+1,root,res);
        board[i][j]=c;


    }
}
