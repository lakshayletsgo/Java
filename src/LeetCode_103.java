//https://leetcode.com/problems/word-ladder/submissions/1165584449/
//This will exceed the time limit but it is easy as compared to other
import java.util.*;

public class LeetCode_103 {
    public static void main(String[] args) {


    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(!wordList.contains(endWord)){
            return 0;
        }
        Set<String> visited = new HashSet<>();
        Queue<String> q= new LinkedList<>();
        q.offer(beginWord);
        int length=0;
        while (!q.isEmpty()){
            int size = q.size();
            length++;
            for(int i=0;i<size;i++){
                String current = q.poll();
                for(int j=0;j<current.length();j++){
                    char[] temp = current.toCharArray();
                    for(char ch='a';ch<='z';ch++){
                        temp[j]=ch;
                        String newWord = new String(temp);
                        if(newWord.equals(endWord)){
                            return length+1;
                        }
                        if(wordList.contains(newWord)&&!visited.contains(newWord)){
                            q.offer(newWord);
                            visited.add(newWord);
                        }
                    }
                }
            }
        }
        return 0;
    }
}
