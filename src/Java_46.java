//Annonymous Class and Lambda Expressions
//Lambda Expressions are those used to make it easy to use functional interface(Interface with one method only)
@FunctionalInterface
interface  m111{
    void printNumber(int a);
}
interface m11{
    void greet();
    void printName();
}
class Name2 implements m11{
    public void greet(){
        System.out.println("Hello");
    }
    public void printName(){
        System.out.println("My name is Lakshay");
    }
}
public class Java_46 {
    public static void main(String[] args) {
            Name2 n1 = new Name2();
            n1.greet();
            n1.printName();

//        This is annonymous class
//        These both are same
//        It is used so that to use an expression only one time
//        It is also used to make a code concise and compact
//        m11 m = new m11() {
//            @Override
//            public void greet() {
//                System.out.println("Not Hello");
//            }
//
//            @Override
//            public void printName() {
//                System.out.println("My name is not Lakshay");
//            }
//        };
//        m.greet();


//        This is lambda expression
        m111 m2=(a)->{
            System.out.println("This is the number: "+a);
        };
        m2.printNumber(10);

    }
}
