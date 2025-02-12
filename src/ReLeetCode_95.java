public class ReLeetCode_95 {
    public static void main(String[] args) {

    }
    private ReLeetCode_95[] children;
    boolean isEndOfWord;
    // Initialize your data structure here.
    public ReLeetCode_95() {
        children = new ReLeetCode_95[26];
        isEndOfWord = false;
    }

    // Adds a word into the data structure.
    public void addWord(String word) {
        ReLeetCode_95 curr = this;
        for(char c: word.toCharArray()){
            if(curr.children[c - 'a'] == null)
                curr.children[c - 'a'] = new ReLeetCode_95();
            curr = curr.children[c - 'a'];
        }
        curr.isEndOfWord = true;
    }

    // Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter.
    public boolean search(String word) {
        ReLeetCode_95 curr = this;
        for(int i = 0; i < word.length(); ++i){
            char c = word.charAt(i);
            if(c == '.'){
                for(ReLeetCode_95 ch: curr.children)
                    if(ch != null && ch.search(word.substring(i+1))) return true;
                return false;
            }
            if(curr.children[c - 'a'] == null) return false;
            curr = curr.children[c - 'a'];
        }
        return curr != null && curr.isEndOfWord;
    }
}
