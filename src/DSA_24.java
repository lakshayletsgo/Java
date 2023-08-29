import java.util.Arrays;

//Printing a star pattern using recursion
public class DSA_24 {
    public static void main(String[] args) {
        printt(5,0);
    }
    static void printt(int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("*");
            printt(r,c+1);
        }else{
            System.out.println();
            printt(r-1,0);
        }

    }



//Using bubble sort using recursion
    static void bubbleSort(int []arr,int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubbleSort(arr,r,c+1);}
        else{
            bubbleSort(arr,r-1,0);
        }
    }
}
