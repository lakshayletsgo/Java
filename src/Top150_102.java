import java.util.*;
public class Top150_102 {

        private static void backTrack(List<Integer> ds, List<List<Integer>> ans, int n, int k, int start){
            if(ds.size() == k){
                ans.add(new ArrayList<>(ds));
                return;
            }
            for(int i = start; i <= n; i++){
                ds.add(i);
                backTrack(ds, ans, n, k, i + 1);
                ds.remove(ds.size() - 1);
            }
        }
        public List<List<Integer>> combine(int n, int k) {
            List<List<Integer>> ans = new ArrayList<>();
            backTrack(new ArrayList<>(), ans, n, k, 1);
            return ans;
        }

}
