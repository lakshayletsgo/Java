public class Top150_15 {
    public int candy(int[] ratings) {
        int[] candles = new int[ratings.length];
        int initial = 0;
        for(int i=0;i<ratings.length;i++)candles[i]=1;
        for(int i=1;i<ratings.length;i++)if(ratings[i]>ratings[i-1])candles[i] = candles[i-1]+1;
        for(int i=ratings.length-1;i>0;i--){
             if(ratings[i-1]>ratings[i]) candles[i-1] = Math.max(candles[i]+1,candles[i-1]);
            initial+=candles[i-1];
        }
        return initial+candles[ratings.length-1];
    }
}
