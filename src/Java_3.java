//Logical Operations, Comparision Operators and Bitwise Operators
import java.util.Scanner;
public class Java_3 {
    public static void main(String[]args){
        int a,b,c,d;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
//        Logical Operators = &&,|| and !
//        Comparision Operators = ==, >= and <=
//        Bitwise Operators = & and |
        System.out.println("If both of the two statements are true then && will return true for e.g. = ((a>b)&&(b>c)) is "+((a>b)&&(b>c)));
        System.out.println("If either of the two statements are true then || will return true for e.g. = ((a>b)||(b>c)) is "+((a>b)||(b>c)));
        System.out.println("! this will only make the true statement false and false statement true ");
        System.out.println("If both the variable are same then this == will return true for e.g. = (c==d) is "+(c==d));
        System.out.println("If first is greater then the second then this >= will return true for e.g. = (a>=d) is "+(a>=d));
        System.out.println("If first is smaller then the second then this <= will return true for e.g. = (d<=a) is "+(d<=a));


    }
}
