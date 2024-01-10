//https://leetcode.com/problems/valid-anagram/description/
//This was simple, in this we first declare an array and then increment the value at the position where the character belongs
public class LeetCode_99 {
    public static void main(String[] args) {
        System.out.println(isAnagram("lakshay","skhaayl"));
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[]arr = new int[26];
        for(char ch:s.toCharArray()){
            arr[ch-'a']++;
        }
        for(char ch:t.toCharArray()){
            arr[ch-'a']--;
        }
        for(int i:arr){
            if(i!=0){
                return false;
            }
        }
        return true;
    }

}
