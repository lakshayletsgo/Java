//Count the number of value having even number of digits
//This is first counting the number of digits and then checking whether it is even or not
public class DSA_2 {
    public static void main(String[] args) {
        int []arr = {21,2,6413,234,214321,243233};
        System.out.println("Number of values are : "+value(arr));
    }
    static int value(int []arr){
        int val =0;
        for(int i=0;i<=arr.length-1;i++){
            int count =0;
            int c = arr[i];
            while(c>0){
                count++;
                c=c/10;
            }
            if(count%2==0){
                val++;
            }
        }
        return val;
    }

}
