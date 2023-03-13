////import java.util.Scanner;
////
////class Rectangle{
////        int length;
////        int breadth;
////    }
////
////public class Main {
////    public static int returnArea(Rectangle r1){
////        return r1.length*r1.breadth;
////    }
////    public static void main(String[]args){
////        Rectangle r1 = new Rectangle();
////        Scanner sc = new Scanner(System.in);
////        r1.length = sc.nextInt();
////        r1.breadth = sc.nextInt();
////        System.out.println("area is"+returnArea(r1));
////    }
////}
////
////import java.util.Scanner;
////class complexNumber{
////    int real;
////    int img;
////}
////public class Main {
////    public static int sumReal(complexNumber c1, complexNumber c2){
////        return c1.real+c2.real;
////    }public static int sumImg(complexNumber c1, complexNumber c2){
////        return c1.img+c2.img;
////    }
////    public static int diffReal(complexNumber c1, complexNumber c2){
////        return c1.real - c2.real;
////    }
////    public static int diffImg(complexNumber c1, complexNumber c2){
////        return c1.img- c2.img;
////    }
////
////    public static void main(String[] args) {
////        complexNumber c1  = new complexNumber();
////        complexNumber c2  = new complexNumber();
////        Scanner sc = new Scanner(System.in);
////        c1.real  = sc.nextInt();
////        c1.img = sc.nextInt();
////        c2.real  = sc.nextInt();
////        c2.img = sc.nextInt();
////        System.out.println("The sum of the two is "+sumReal(c1,c2)+"+"+sumImg(c1,c2)+"i");
////        System.out.println("The diff of the two is "+diffReal(c1,c2)+"+"+diffImg(c1,c2)+"i");
////    }
////}
////
////import java.lang.*;
////import java.util.*;
////class points{
////    int x;
////    int y;
////}
////public class Main {
////    public static double returnDist(points a,points b){
////        int z = b.x - a.x;
////        int p = b.y-a.y;
////        int o = z*z + p*p;
////        return Math.sqrt(o);
////    }
////    public static void main(String[]args){
////        Scanner sc=  new Scanner(System.in);
////        points a = new points();
////        points b = new points();
////        a.x = sc.nextInt();
////        a.y = sc.nextInt();
////        b.x = sc.nextInt();
////        b.y = sc.nextInt();
////        System.out.println("Distance is "+returnDist(a,b));
////
////    }
////}
//
//
//class Employee{
//    String name;
//    int year;
//    long salary;
//    String Address;
//}
//public class Main {
//    public static void main(String[]args){
//        Employee e1[];
//        Employee e2[];
//        Employee e3[];
//        e1.name[0] = "Lakshay"
//    }
//}
import java.util.Scanner;

class Star{
    int s1;
    int s2;
    int s3;
    int base;
    int height;
    void perimeter(int x,int y, int z){
        System.out.print("Perimeter = "+(x+y+z));
        System.out.println(" ");
    }

    void area(int b,int h){
        System.out.print("Area = "+0.5*b*h);
    }

}
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Star obj = new Star();

        obj.s1=3;
        obj.s2=4;
        obj.s3=5;
        System.out.println("Enter Base and Height:");
        obj.base = sc.nextInt();
        obj.height = sc.nextInt();
        obj.perimeter(obj.s1,obj.s2,obj.s3);
        obj.area(obj.base,obj.height);
        sc.close();
    }
}
//
//class Employee{
//    String name;
//    int
//}
