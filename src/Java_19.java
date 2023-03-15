//Method Overriding
//Method Overriding is not similar to method overloading
//In method overloading same class is passed with different parameters but in this same method is override
class Base12{
    int a;
    public void method1(){
        System.out.println("This is a method 1 of Base");
    }
    public void method2(){
        System.out.println("This is a method 2 of Base");
    }
}

//This is known as overriding
//In this method1 of Extended1 class is override over method1 of Base class
//In this if we make an object of an Extended1 class then new method will be taken
class Extended1 extends Base12{
    @Override
    public void method1() {
        System.out.println("This is a method of extended class ");
    }
}
public class Java_19 {
    public static void main(String[] args) {
        Base12 b1 = new Base12();
//        b1.method2();
        b1.method1();

        Extended1 e2 = new Extended1();
//        e2.method2();
        e2.method1();
    }
}
