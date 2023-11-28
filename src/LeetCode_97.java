//https://leetcode.com/problems/flipping-an-image/
//This was easy
//In this i have made so that it first reverse the array and then change the bit
//All other solution are using the sama approach
public class LeetCode_97 {
    public static void main(String[] args) {
        int[][]arr = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
//        flipAndInvertImage(arr);
    }
    public  static int[][]  flipAndInvertImage(int[][] image) {
        boolean odd = image.length%2!=0;
        int n= image.length-1;
        int k =0;
        for(int i=0;i<image.length;i++){
            if(odd){

                while (k<image.length/2&&n>image.length/2){
                    int temp = image[i][k];
                    image[i][k] = image[i][n];
                    image[i][n] = temp;

                    k++;
                    n--;
                }
            }else{
                while (k<image.length/2&&n>=image.length/2){
                    int temp = image[i][k];
                    image[i][k] = image[i][n];
                    image[i][n] = temp;

                    k++;
                    n--;
                }
            }
            k = 0;
            n = image.length-1;
        }

        for(int i =0;i< image.length;i++){
            for(int j=0;j<image.length;j++){
                image[i][j] = image[i][j]==1?0:1;
            }
        }
        return image;

    }
}
