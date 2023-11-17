//https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/submissions/1100864746/
//This was easy
//In this we just have to spilt every sentence and then check for its length
public class LeetCode_86 {
    public static void main(String[] args) {
        String[]arr = {"please wait", "continue to fight", "continue to win"};
        System.out.println(mostWordsFound(arr));
    }
    public static int mostWordsFound(String[] sentences) {
        int max =0;
        for(String str:sentences){
            String[]arr = str.split(" ");
            max = Math.max(max,arr.length);
        }
        return max;
    }
}
