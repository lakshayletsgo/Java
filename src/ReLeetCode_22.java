public class ReLeetCode_22 {
    public static void main(String[] args) {
        System.out.println(searchMatrix(new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}},23));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length<1||matrix[0].length<1){
            return false;
        }
        int c = matrix[0].length-1;int r=0;
        while (c>=0&&r<matrix.length){
            if(matrix[r][c]==target){
                return true;
            } else if (matrix[r][c] < target) {
                r++;
            }else{
                c--;
            }
        }
        return false;
    }
}
