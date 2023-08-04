//Missing Element Question
//In this the range of the element starts from 0 to n
//So here the element will be at its value index
//First we sort it accordingly and the value which is equal to the length is kept at the last and after we done sorting we just check at which the element is and return the index
public class DSA_17 {
    public static void main(String[] args) {
        int[]arr = {4,0,1,3};
        System.out.println(missingElement(arr));
    }
    static int missingElement(int []arr){
        int i=0;
        while (i<arr.length){
            int correct= arr[i];

//            Here we are checking that the value shouldn't exeecd the length of the array
            if(arr[i]< arr.length&&arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else {
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j){
                return j;
            }
        }
        return -1;
    }
    static void swap(int []arr,int first,int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last]  = temp;
    }
}
