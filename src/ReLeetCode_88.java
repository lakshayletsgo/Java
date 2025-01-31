public class ReLeetCode_88 {
    public static void main(String[] args) {

    }
    private int[] heights;
    private int[] d;
    private int[] l;
    private int[] r;
    private int lenLeaves;

    public int[] treeQueries(TreeNode root, int[] queries) {
        heights = new int[50000];
        d = new int[100001];
        l = new int[100001];
        r = new int[100001];
        lenLeaves = 0;

        search(root, 0);

        int n = lenLeaves;
        int[] maxl = new int[n];
        int[] maxr = new int[n];

        for (int i = 1; i < n; i++) {
            maxl[i] = Math.max(maxl[i-1], heights[i-1]);
        }

        for (int i = n-2; i >= 0; i--) {
            maxr[i] = Math.max(maxr[i+1], heights[i+1]);
        }

        int[] ret = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int query = queries[i];
            int maxxl = maxl[l[query]];
            int maxxr = maxr[r[query]];
            ret[i] = Math.max(Math.max(maxxl, maxxr), d[query]-1);
        }

        return ret;
    }

    private void search(TreeNode p, int h) {
        d[p.val] = h;

        if (p.left == null && p.right == null) {
            heights[lenLeaves] = h;
            l[p.val] = r[p.val] = lenLeaves;
            lenLeaves++;
            return;
        }

        l[p.val] = lenLeaves;

        if (p.left != null) {
            search(p.left, h + 1);
        }
        if (p.right != null) {
            search(p.right, h + 1);
        }

        r[p.val] = lenLeaves - 1;
    }
}
