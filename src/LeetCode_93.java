//https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
//This is a one line code
// return String.join("", word1).equals(String.join("", word2));
public class LeetCode_93 {
    public static void main(String[] args) {
        String[]arr = {"ab", "c"};
        String[]arr2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(arr,arr2));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        for(String str3:word1){
            str.append(str3);
        }
        for(String str3:word2){
            str2.append(str3);
        }
        String newS= str.toString();
        String newS2= str2.toString();
        for(int i=0;i<newS.length()&&i<newS2.length();i++){
            if(newS.charAt(i)!=newS2.charAt(i)){
                return false;
            }
        }
        if(newS.length()!=newS2.length()){
            return false;
        }
        return true;

    }
}
