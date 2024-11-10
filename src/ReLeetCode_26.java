import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class ReLeetCode_26 {
    class Data{
        int timeStamp;
        String val;
        public Data(int ti,String val){
            this.timeStamp = ti;
            this.val = val;
        }

    }
    class TimeMap {
        HashMap<String, List<Data>> map;
        public TimeMap() {
            map = new HashMap<>();
        }

        public void set(String key, String value, int timestamp) {
            map.computeIfAbsent(key, k->new ArrayList<>()).add(new Data(timestamp,value));
        }


        public String get(String key, int timestamp) {
            if(!map.containsKey(key)) return "";
            return binarySearchHelper(map.get(key),timestamp);
        }

        private String binarySearchHelper(List<Data> list,int times){
            int l=0, r=list.size()-1;
            while (l<r){
                int mid = (l+r+1)>>>1;
                if (times<list.get(mid).timeStamp){
                    r = mid-1;
                }else{
                    l=mid;
                }
            }
            return list.get(l).timeStamp<=times?list.get(l).val:"";
        }
    }
    public static void main(String[] args) {

    }

}
