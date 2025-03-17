import java.util.Stack;

public class ReLeetCode_135 {
    public static void main(String[] args) {

    }
    public boolean checkValidString(String s) {
        int min=0,max=0;
        for (char ch:s.toCharArray()){
            if (ch=='('){
                max++;min++;
            } else if (ch == ')') {
                max--;min--;
            }else {
                max++;min--;
            }
            min = Math.max(min,0);
            if (max<0)return false;
        }
        return min==0;
    }
}
