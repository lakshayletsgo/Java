  // Interfaces
//Interface is similar to abstract classes and method.
//Isme sirf abstract methods ho skte hai. Isko use karne ke liye ham inplements word use karte hai
// We can create a class using multiple interfaces unlike abstract classes
// We can also use extends a class
//We can't modify values in the interface
//  We can modify the values of the interface in the class that implements it
interface name{
     void Name1(String name);
}
interface Bicycle{
    int a= 10;
     void applyBrake(int decrement);
     void speedUp(int increment);
}
class Hero implements Bicycle,name {
    int speed;
    public void Name1(String s1){

    }
    public void applyBrake(int decrement1){
        speed -= decrement1;
    }
    public void speedUp(int decrement1){
        speed += decrement1;
    }
}
public class Java_24 {
    public static void main(String[] args) {
        Hero h1 = new Hero();
        h1.applyBrake(1);
//        h1.a;// This will gives a error
    }
}
