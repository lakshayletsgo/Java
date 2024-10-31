public class ReLeetCode_9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    public static boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while (i<=j){
            char currStart = s.charAt(i);
            char currEnd = s.charAt(j);
            if(!Character.isLetterOrDigit(i)){
                i++;
            } else if (!Character.isLetterOrDigit(j)) {
                j--;
            }else{
                if(Character.toLowerCase(currStart)!=Character.toLowerCase(currEnd)){
                    return false;
                }
                i++;
                j--;
            }

        }
        return true;
    }
}
