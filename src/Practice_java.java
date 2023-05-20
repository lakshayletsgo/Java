//import
// exercises.java.*;
class CheckArgumentException extends Exception{
    @Override
    public String toString() {
        return "You haven't entered number greater than 5";
    }
}
public class Practice_java {
    public static void main(String[] args) {
        int sum = 0;
        try{
//            System.out.println("Enter your number: ");
            int  [] arr =new int[5];
            for(int i=0;i<args.length;i++){
                arr[i] = Integer.parseInt(args[i]);
            }
            for(int i=0;i<5;i++){

                if(arr[i]<5){
                    throw new CheckArgumentException();
                }else{
                    sum = sum+arr[i];
                }
            }
            System.out.println("Sum of the number is "+sum);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}