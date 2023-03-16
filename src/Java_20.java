//Dynamic Methood Dispatch
// In this if we make an object like (super s1 = new sub()) then we can use the methods of super class
//But we can't use the method of only sub class that are not override
//We can only use ovveride method and methods of superclass
// If there is method in super class and it is ovveriden it then we can use the ovvveriden method only
class Base{
    int a;
    public void name(){
        System.out.println("This is a name method in Base class");
    }
    public void classname(){
        System.out.println("This is a Base class method 2");
    }
}
class Extended extends Base{
    public void name(){
        System.out.println("This is a name method in Extended class");
    }
    public void speak(){
        System.out.println("This is a speak method in Extended class");
    }
}
public class Java_20 {
    public static void main(String[] args) {
        Base b1 = new Extended();
//        Extended1 w1 = new Base(); //This is not allowed, This will give error
        b1.name();
//        b1.speak(); //This will also give error
        b1.classname();
    }
}
