//Spilt Array Largest Sum
//In this we divide the array into the given parts and we then have to calculate number(total)
//It says we first have to divide the array into given pieces and then take the sum of each part and out of two parts which sum is larger is then compared to the rest of the possibilities and the smallest in that is the value
// For eg  {2,3,6,1,4}  m=2
// We can divide this array in two parts in 5 ways
//  { [2],[3,6,1,4] }  ==>  2 ,  14   (Largest of them)  ==> 14
//  { [2,3],[6,1,4] }  ==>  5,   11   (Largest of them)  ==> 11
//  { [2,3,6],[1,4] }  ==>  11,  5    (Largest of them)  ==> 11
//  { [2,3,6,1],[4] }  ==>  12,  4    (Largest of them)  ==> 12
//  Smallest of them is 11 therefore it is the ans

// To find it we first have to determine the smallest and largest values
// Smallest value is there when there the parts are maximum and the largest value among them is the largest (Here is the 6)
//Largest value is there when there the parts are min and the sum of the array(Here it is 16)
//We then define the mid ((start+end)/2)
// We then divide the array in 1 piece and if increase the value of piece whenever the total of the values in the piece exceed the mid
//If it doesn't exceed it we just keep adding the value to the array
// We then check if the number of pieces is more than the provided pieces; If it is more then we shift the start to the mid+1 and then run the loop again
//If the number of pieces is equal or less then the provided pieces we shift the end to the mid
//We keep on doing it untill we have reached a point where end is equal to the start that is when loop will break and program end and return the end as the end and start point to same


public class DSA_10 {
    public static void main(String[] args) {
        int []arr=  {2,3,6,1,4};
        int m = 2;
        System.out.println(spiltArray(arr,m));
    }
    static int spiltArray(int []arr,int m){
        int start =0;
        int end = 0;
        for(int i=0;i<arr.length;i++){
            start = Math.max(start,arr[i]);
            end+=arr[i];
        }
        while(start<end){
            int mid=start+(end-start)/2;
            int sum =0;
            int pieces = 1;
            for (int num :arr) {
                if(sum+num>mid){
                    sum= num;
                    pieces++;
                }else{
                    sum+=num;
                }
            }
            if(pieces>m){
                start = mid+1;
            }else{
                end = mid;
            }

        }
        return end;
    }
}
