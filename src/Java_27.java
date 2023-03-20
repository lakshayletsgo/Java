//Practice
//abstract class Pen{
//    abstract public void write();
//    abstract public void refill();
//}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Monkey{
    public void jump(){
        System.out.println("Jumping...");
    }
    public  void bite(){
        System.out.println("Biting!!");
    }
}
class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("Eating...");
    }
    public void sleep(){
        System.out.println("Sleeping...");
    }
}
public class Java_27 {
    public static void main(String[] args) {
//        Human h1 = new Human();
//        h1.eat();
//        h1.bite();
//        h1.jump();
//        h1.sleep();

//        This is polymorphism
//        In this we have used Monkey as a reference and human as an object and we have created an object
        Monkey m1 = new Human();
//        m1.bite();
//        m1.jump();
        BasicAnimal b1 = new Human();
//        b1.sleep();
//        b1.eat();


    }
}
