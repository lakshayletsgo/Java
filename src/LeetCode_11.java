//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
public class LeetCode_11 {
    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "leeto";
        System.out.println(strStr(haystack,needle));
    }
    public static int strStr(String haystack, String needle) {

        return haystack.indexOf(needle);
    }
}
