//Duplicate Elements
//In this we first have to check if the current element is duplicate or not
//For that we first sort it
//Then we check after sorting whether there is a duplicate element present on the correct index or not
//If yes return it
public class DSA_19 {
    public static void main(String[] args) {
        int []arr = {3,2,1,2,4};
        System.out.println(duplicateElement(arr));
    }
    static int duplicateElement(int []arr){
        int i=0;
        while (i<arr.length){
            if(arr[i]!=i+1){

                int correct = arr[i]-1;
                if(arr[i]!=arr[correct]){
                    swap(arr,i,correct);
                }else {
                    return arr[i];
                }
            }else{

                i++;
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
