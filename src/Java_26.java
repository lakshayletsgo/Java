//Polymorphism
//This is polymorphism, in which we use multiple interfaces and implements them in one class and
// then we use dynamic method dispatch i.e. like this GPS s1 = new Phone()
//From this we can use GPS features only,  We can create more of it like  Camera1 =  new Phone()
interface GPS{
    void trackPlace();
    int areaCoordinate();
}
interface Camera1{
    void flashLight();
    void takingSnap();
}
class Phone implements GPS,Camera{
    public void trackPlace(){
        System.out.println("Tracking Your Area");
    }
    public int areaCoordinate(){
        int a = 10;
        return 10;
    }
    public void flashLight(){
        System.out.println("FlashLight!!");
    }
    public void takingSnap(){
        System.out.println("Taking Picture");
    }
    public void recordScreen(){
        System.out.println("Recording Screeen");
    }
}
public class Java_26 {
    public static void main(String[] args) {
        Phone p1  = new Phone();
        GPS g1 = new Phone(); //Dynamic method dispatch
        g1.trackPlace();
        g1.areaCoordinate();
    }
}
