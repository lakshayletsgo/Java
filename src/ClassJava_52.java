import java.util.Scanner;

public class ClassJava_52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=  sc.nextInt();
        }
        System.out.println("Sum of all Elements : "+sumAll(arr));
        System.out.println("Sum of alternate Elements : "+sumAlt(arr));
        System.out.println("Second Highest Element : "+secHigh(arr));
    }
    static int sumAll(int []arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum +=arr[i];
        }
        return sum;
    }
    static int sumAlt(int []arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                sum+=arr[i];
            }
        }
        return sum;
    }
    static int secHigh(int[]arr){
        int max = arr[0];
        int secMax  =arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(secMax<arr[i]){
                if(arr[i]==max){
                    continue;
                }else {
                    secMax = arr[i];
                }
            }
        }
        return secMax;
    }

}
