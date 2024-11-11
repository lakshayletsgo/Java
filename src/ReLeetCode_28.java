public class ReLeetCode_28 {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
    public static int maxProfit(int[] prices) {
        int minPr = Integer.MAX_VALUE;
        int maxPr = 0;
        for (int i=0;i<prices.length-1;i++){
            minPr = Math.min(prices[i],minPr);
            maxPr = Math.max(maxPr,prices[i]-minPr);
        }
        return maxPr;
    }
}
