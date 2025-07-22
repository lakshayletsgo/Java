import java.util.*;
public class Top150_53 {
    public String simplifyPath(String path) {
        String[] pathInArray= path.split("/");
        Stack<String> stack = new Stack<>();
        for(String ch: pathInArray){

            if(ch.equals("..")){if(!stack.isEmpty())stack.pop();}
            else if(ch.equals("")||ch.equals("."))continue;
            else stack.push(ch);
        }

        StringBuilder str = new StringBuilder();
        while(!stack.isEmpty()){
            str.insert(0,"/"+stack.pop());
        }
        return str.length()==0?"/":str.toString();
    }
}
