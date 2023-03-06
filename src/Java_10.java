//Variable Arguments
public class Java_10 {

//    This will return the input value as a array. In this it will return 2 and 3 as [2,3]
//    If we add another arguement like int a then it will be a compulsory argument to be given so if it not passed it will give an error
    public static int sum(int ...arr){
        int sum =0;

//        Then we will apply for each loop to it
        for(int element:arr){
            sum += element;
        }
        return sum;
    }


    public static void main(String[]args){
        System.out.println("Sum of 2 and 3 is "+sum(2,3));
        System.out.println("Sum of 2,3,45 and 3 is "+sum(2,3,45,3));
        System.out.println("Sum of 4,31,3,2 and 3 is "+sum(4,31,3,2,3));
    }
}
