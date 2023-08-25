import java.util.Arrays;

public class ClassJava_54 {
    public static void main(String[] args) {
        int[]arr = {2,3,4,5,6,7,8};
//        Traversing Array
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(linearSearch(arr,5));
        System.out.println(binarySearch(arr,5));
        System.out.println("New Array is "+Arrays.toString(insert(arr,10)));
        System.out.println("New Array is "+Arrays.toString(delete(arr)));
    }
    static int[] insert(int []arr, int number){
        int [] arr2 = new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            arr2[i]=arr[i];
        }
        arr2[arr.length] = number;
        return arr2;
    }
    static int[] delete(int []arr){
        int []arr2  = new int[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            arr2[i] = arr[i];
        }
        return arr2;
    }
    static int linearSearch (int[]arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        System.out.println("No such element.");
        return -1;
    }
    static int binarySearch(int[]arr,int target){
        int s = 0;
        int e = arr.length-1;
        while (s<=e){
            int m = s +(e-s)/2;
            if(arr[m]==target)
            {
                return m;
            }
            if(arr[m]<target){
                e = m-1;
            }else{
                s = m+1;
            }
        }
        System.out.println("No such Element");
        return -1;
    }

}