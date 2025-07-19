import java.util.*;
public class Top150_43 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            char [] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            String sortedString = new String(temp);
            if(!map.containsKey(sortedString)){
                map.put(sortedString,new ArrayList<>());
            }
            map.get(sortedString).add(strs[i]);
        }
        Set<String>keys= map.keySet();
        for(String key:keys){
            ans.add(map.get(key));
        }
        return ans;
    }
}
