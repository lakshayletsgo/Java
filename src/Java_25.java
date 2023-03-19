//More about interfaces
//We can also inherit interfaces
// We can't use private method of interface
// We use it so that we can store some logic in it of interface and use it in interface itself
// We have to obviously define all the abstract methods of the inherited class also
interface Camera{
    void takingSnap();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void greeetings(){
        System.out.println("Good Morning sir");
        greet();
    }
}
interface flashLight extends Camera{
    void flashLights();
}
class Smartphone implements Camera{
    public void takingSnap(){
        System.out.println("Taking Picture");
    }
}
class App implements flashLight{
    public void takingSnap(){
        System.out.println("Taking Picture");
    }
    public void flashLights(){
        System.out.println("Flash!!!");
    }

}
public class Java_25 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone();
//        s1.takingSnap();
//        s1.greeetings();
        App a1 = new App();
        a1.takingSnap();
        a1.flashLights();
        a1.greeetings();
    }
}
