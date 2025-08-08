import java.util.*;
public class Top150_96 {
    public int minMutation(String start, String end, String[] bank) {
        Queue<String> q = new LinkedList<>();
        HashSet<String> vis = new HashSet<String>();

        List<String> banks = Arrays.asList(bank);
        int steps = 0;
        q.add(start);
        vis.add(start);
        while (!q.isEmpty()) {
            for (int i = q.size(); i > 0; i--) {
                String s = q.poll();
                if (s.equals(end)) return steps;
                char[] ca = s.toCharArray();
                for (int j = 0; j < 8; j++) {
                    char oc = ca[j];
                    for (int k = 0; k < 4; k++) {
                        ca[j] = "ACGT".charAt(k);
                        String t = new String(ca);
                        if (!vis.contains(t) && banks.contains(t)) {
                            q.add(t);
                            vis.add(t);
                        }
                    }
                    ca[j] = oc;
                }
            }
            steps += 1;
        }
        return -1;
    }
}
