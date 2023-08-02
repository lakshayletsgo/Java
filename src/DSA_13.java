//Bubble Sort
//It is used to sort an array
//This has a time complexity of best case 0(N) and worst case is 0(N*N)
//In this we first run a loop for the first element to be sorted
//We check i and i-1 element if i is smaller then the i-1 then it will swap
//It will perform this untill the end of the loop
//After the end of first loop the end of the array has the greatest element
//We run this for the entire length of the array
//It is stable sort because when there are multiple same element it mentains its position
import java.util.Arrays;
public class DSA_13 {
    public static void main(String[] args) {
        int []arr= {2,5,14,3,25,6};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[]arr){
        boolean sorted = false;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
//                    Swap
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    sorted = true;
                }
            }
            if(!sorted){
                break;
            }
        }
    }
}
