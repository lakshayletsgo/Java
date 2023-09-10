// Removing a character or an entire word from a string using recursion
public class DSA_28 {
    public static void main(String[] args) {
        skip("","Lakshay");
        System.out.println(skip2(""));
        System.out.println(skipWord("kahsokasf"));
    }
    static void skip(String p, String orig){
        if(orig.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = orig.charAt(0);
        if(ch=='a'){
            skip(p,orig.substring(1));
        }else{
            skip(p+ch,orig.substring(1));
        }
    }
    static String skip2(String orig){
        if(orig.isEmpty()){
            return "";
        }
        char ch = orig.charAt(0);
        if(ch=='a'){
            return skip2(orig.substring(1));
        }else{
            return ch+skip2(orig.substring(1));
        }
    }

    static String skipWord(String org){
        if(org.isEmpty()){
            return " ";
        }
        if(org.startsWith("ok")){
            return skipWord(org.substring(2));
        }else {
            return org.charAt(0)+ skipWord(org.substring(1));
        }
    }
}
