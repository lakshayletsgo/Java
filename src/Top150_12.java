import java.util.*;

public class Top150_12 {
    Map<Integer,Integer> map;
    List<Integer> list;
    Random random;

    public Top150_12() {
        map = new HashMap<>();
        list = new ArrayList<>();
        random = new Random();

    }

    public boolean insert(int val) {
        if(map.containsKey(val))return false;
        list.add(val);
        map.put(val,list.size()-1);
        return true;
    }

    public boolean remove(int val) {
        if(!map.containsKey(val))return false;
        int ind = map.get(val);
        int last = list.get(list.size()-1);
        list.set(ind,last);
        map.put(last,ind);
        list.remove(list.size()-1);
        map.remove(val);
        return true;
    }

    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}
