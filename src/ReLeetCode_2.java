import java.util.HashMap;

public class ReLeetCode_2 {
    public static void main(String[] args) {
        System.out.println(isAnagram("laksmay","akshayl"));
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character, Integer> map= new HashMap<>();
        for(char i:s.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(char i:t.toCharArray()){
            if(map.get(i)!=null&&map.get(i)>1){
                map.put(i,map.get(i)-1);
            }else{
                map.remove(i);
            }
        }
        return map.isEmpty();
    }
}
