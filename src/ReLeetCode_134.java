import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReLeetCode_134 {
    public static void main(String[] args) {

    }
    public List<Integer> partitionLabels(String s) {
        Map<Character,Integer>map = new HashMap<>();
        List<Integer>list = new ArrayList<>();
        int max=0,prev=-1;
        for (int i=0;i<s.length();i++)map.put(s.charAt(i),i);
        for (int i=0;i<s.length();i++){
            max = Math.max(map.get(s.charAt(i)),max);
            if (max==i){
                list.add(i-prev);
                prev = max;}}
        return list;
    }
}
