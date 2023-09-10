//Sub Sequence of a string
//In this we have used recursion in such a way that it will either accept an char or reject it
//It will print all the string that can be formed using it
//Note that it don't change the order

import java.util.LinkedList;

public class DSA_29 {
    public static void main(String[] args) {
        System.out.println(subStr2("","Lakshay"));
        System.out.println(subStr2("","Lakshay").size());
    }

    static void subStr(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subStr(p+ch,up.substring(1));
        subStr(p,up.substring(1));
    }

    static LinkedList<String> subStr2(String p, String up){
        if(up.isEmpty()){
            LinkedList<String> list = new LinkedList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        LinkedList<String> left = subStr2(p+ch,up.substring(1));
        LinkedList<String> right = subStr2(p,up.substring(1));
        left.addAll(right);
        return left;
    }
}
