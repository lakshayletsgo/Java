import java.util.Arrays;

public class ReLeetCode_101 {
    public static void main(String[] args) {

    }
    public int leastInterval(char[] tasks, int n) {
        int[]freq = new int[26];
        for (int i=0;i<tasks.length;i++){
            freq[tasks[i]-'A']++;
        }
        Arrays.sort(freq);
        int chunk = freq[25]-1;
        int idle = chunk*n;
        for (int i = 24; i >=0; i--) {
            idle -=Math.min(freq[i],chunk);
        }
        return idle<0?tasks.length:tasks.length+idle;
    }
}
