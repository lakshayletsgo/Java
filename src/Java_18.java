//Constructors in Inheritance
class Base1{
    int x;
    Base1(){
        System.out.println("This is non-arguments base constructors ");
    }
    Base1(int a){
        System.out.println("This is one argumenet base constructor in which value of a is "+a);
    }

}

//In this jo bhi base ka constructor hoga voh bhi inherit hoga.
//Pehle base ka constructor call hoga uske baad extended class wale ka
//Ek-type se sab kuch inherit ho jata hai
class Extended2 extends Base1{
    int y;


    Extended2(){
//        Super likhne se jo argument wala hai ham voh call kar skte hai
        System.out.println("This is a derived class constructor with no arguments");
    }

    Extended2(int x,int y){
        super(x);
        System.out.println("This is Extended class with 2 values "+x+" "+y);
    }
}
class childOfExtended extends Extended2{
    childOfExtended(){
        System.out.println("This is a childOfExtended class with  constructor of no parameters");
    }
    childOfExtended(int x,int y,int z){
        super(x,y);
        System.out.println("This is childOfExtended class with constructor of 3 parameters "+x+" "+y+" "+z);
    }
}
public class Java_18 {
    public static void main(String[] args) {
//        Base1 b1 = new Base1();
//        Extended2 e1 = new Extended2();
        childOfExtended c2 = new childOfExtended();
        childOfExtended c1 = new childOfExtended(23,23,13);

    }
}
