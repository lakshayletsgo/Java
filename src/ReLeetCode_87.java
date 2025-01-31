public class ReLeetCode_87 {
    public static void main(String[] args) {

    }
    public int[] cycleLengthQueries(int n, int[][] queries) {
        int[] count = new int[queries.length];
        for(int i=0; i<queries.length; i++){
            count[i] += dis(queries[i][0], queries[i][1]);
        }
        return count;
    }
    private int dis(int n1, int n2){
        int count = 0;
        while(n1 != n2){
            if(n1 > n2) n1 /= 2;
            else    n2 /= 2;
            count++;
        }
        return count+1;
    }
}
