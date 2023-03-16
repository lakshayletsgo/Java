//Abstract class and methods
//If we don't give instruction in a method then it is said to be abstract method. If there is even 1 abstract method in a class then the entire class has to be abstract
// We have to override the method in the sub class of the parent abstract class
//We can't create a sub class of the abstract class without overriding the abstract method
// We can't create an object of a abstract class
abstract class Parent{
    public int a;
    public void name(){
        System.out.println("This is the parent class");
    }
    abstract public void greet();
}
class chilsd extends Parent{
    public void greet(){
        System.out.println("Good Morning");
    }
}
public class Java_23 {
    public static void main(String[] args) {
        chilsd c1 = new chilsd();
        c1.greet();

    }
}
