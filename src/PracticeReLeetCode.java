import java.util.HashMap;
import java.util.Map;

public class PracticeReLeetCode {
    PracticeReLeetCode children[];
    boolean isEndOfWord;
    public PracticeReLeetCode() {
        children = new PracticeReLeetCode[26];
        isEndOfWord= false;
    }

    public void addWord(String word) {
        PracticeReLeetCode curr = this;
        for (char c:word.toCharArray()){
            if (curr.children[c-'a']==null){
                curr.children[c-'a'] = new PracticeReLeetCode();
            }
            curr = curr.children[c-'a'];
        }
        curr.isEndOfWord = true;
    }

    public boolean search(String word) {
        PracticeReLeetCode curr = this;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch=='.'){
                for (PracticeReLeetCode ch2: curr.children){
                    if (ch2!=null&&ch2.search(word.substring(i+1)))return true;
                    return false;
                }
            }
            if (curr.children[ch-'a']==null)return false;
            curr = curr.children[ch-'a'];

        }
        return curr!=null&&curr.isEndOfWord;
    }
}
