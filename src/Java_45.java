//Annotations
//They are used to help give more information about a programme
//They are also used to give assurity that the method is ovveride or something
//Deprecated is used to draw a line on a method to show that it has been removed and the new method has taken its place
//It also a warning which will be shown in the compiler

//To remove the warning we can deprecate the warning by using the SuppressWarning annotation
//Functional Interface annotation is used to show that an interface has only one abstract method
@FunctionalInterface
interface f11{
    void greet();
}
class student1{
    public void printHello(){
        System.out.println("Hello THis is class First");
    }
}
class Student22 extends student1{
    @Override
    public void printHello(){
        System.out.println("Hello THis is class Second");
    }

    @Deprecated
    public int sum(int a,int b){
        return a+b;
    }

}
public class Java_45 {
    @SuppressWarnings("deprecation")   //The deprecation warning will be not be shown
    public static void main(String[] args) {
        Student22 s =new Student22();
        System.out.println(s.sum(10,2));
    }
}
