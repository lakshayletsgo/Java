// Missing Smallest Positive
//Here we sort the array using the cyclic sort and then check which element is at its wrong index
//We ignore the negative values
//If there is no missing index return the length of the array +1
public class DSA_21 {
    public static void main(String[] args) {
        int []arr = {-1,1,5,3};
        System.out.println(missingPositive(arr));
    }
    static int missingPositive(int[]arr){
        int i=0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i]<arr.length&&arr[i]>0&&arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        for(int j=0;j< arr.length;j++){
            if(arr[j]!=j+1){
                return j+1;
            }
        }
        return arr.length+1;
    }
    static void swap(int []arr,int first,int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
