import java.util.*;
public class Top150_41  {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        String []words = s.split(" ");
        if(pattern.length()!=words.length)return false;
        for(int i=0;i<pattern.length();i++){
            if(map.containsKey(pattern.charAt(i))) {if(!((map.get(pattern.charAt(i))).equals(words[i]))) return false;}
            else {
                if(set.contains(words[i]))return false;
                map.put(pattern.charAt(i),words[i]);
                set.add(words[i]);
            }
        }
        return true;
    }
}
