//Root Decomposition(Mo's Algorithm)
//It is used in the range question where we are given a range and we have to compute betweenm those range either sum, max, min, avg and so on
//We do this by first dividing the array in root n part and then we take the sum of each block
//Then we first take the left of the range and then check for its quater and then check its value from original array
//Here we have 2 array original and the order where it is divided
public class DSA_68 {
    public static void main(String[] args) {
        int []arr = {2,3,5,1,6,4,7,9,12,3,25,32};
        System.out.println(moAlgo(arr,1,6));

    }
    public static int moAlgo(int[]arr,int l,int r){
        int n = arr.length;
        int sqrt = (int) Math.sqrt(n)+1;
        int block_id = -1;
        int[]blocks = new int[sqrt+1];
        for(int i=0;i<n;i++){
            if(i%sqrt==0){
                block_id++;
            }
                blocks[block_id] +=arr[i];

        }
        return query(arr,blocks,l,r,sqrt);
    }
    public static int query(int[]arr,int []block,int l,int r,int sqrt){
        int ans = 0;
        while (l%sqrt!=0&&l<r&&l!=0){
            ans+=arr[l];
            l++;
        }
        while (l+sqrt<=r){
            ans+=block[l/sqrt];
            l+=sqrt;
        }
        while (l<=r){
            ans+=arr[l];
            l++;
        }

        return ans;
    }

    public static void update(int[]block,int[]arr,int i,int val, int sqrt){
        int block_id =  i/sqrt;
        block[block_id]+=(val-arr[i]);
        arr[i] = val;

    }

}
