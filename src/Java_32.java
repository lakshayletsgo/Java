// Practice Thread
class printHello extends Thread{
    public void run(){
//    while(false){
//        try{
//        Thread.sleep(200);}
//        catch (Exception e){
//            System.out.println(e);
//        }
//        System.out.println("Hello");
//    }
    }
}
class printGoodMorning extends Thread{
    public void run(){
        while (true){
            try{
                Thread.sleep(200);}
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Good Morning");
        }
    }
}
public class Java_32 {
    public static void main(String[] args) {
        printHello p1 = new printHello();
        printGoodMorning g1  = new printGoodMorning();
        p1.setPriority(3);
        g1.setPriority(7);
        System.out.println(p1.getPriority());
        System.out.println(g1.getPriority()); //This is used to set priority of a thread
        System.out.println(p1.getState());
        p1.start();
        System.out.println(p1.getState()); //This is used to get the running state or not running state of a thread
        System.out.println(p1.currentThread().getState());  // current Thread is a function used to refer to the current running thread
        g1.start();
    }
}
