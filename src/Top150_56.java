import java.util.*;
public class Top150_56 {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int num = 0,sign = 1, result = 0;
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch))num = num*10+(ch-'0');
            else if(ch=='+'){
                result +=sign*num;
                num = 0;
                sign = 1;
            }else if(ch=='-'){
                result +=sign*num;
                num = 0;
                sign = -1;
            }else if(ch =='('){
                stack.push(result);
                stack.push(sign);
                sign=1;
                result = 0;
            }else if(ch==')'){
                result +=sign*num;
                num = 0;
                result *=stack.pop();
                result +=stack.pop();
            }
        }
        if(num!=0)result +=sign*num;
        return result;
    }
}
