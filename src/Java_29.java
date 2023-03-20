//Multithreading using runnable interface
// Runnable Interface and Thread class ko use karke banane se thread same hi banega
//We have to use the method run in this
class ThreadingLearning3 implements Runnable{
    public void run(){
        int i=0;
        while(i<20){
        i++;
        System.out.println("This is thread 1 in class 1");
        System.out.println("This is Runnable interface method 1");
    }}
}class ThreadingLearning4 implements Runnable{
    public void run(){
        int j=0;
        while (j<20){
        j++;
        System.out.println("This is thread 2 in class 2");
        System.out.println("This is Runnable interface method 2");
    }}
}
public class Java_29 {
    public static void main(String[] args) {
        ThreadingLearning3 tl1 = new ThreadingLearning3();
        Thread t1 = new Thread(tl1);
        ThreadingLearning4 tl2 = new ThreadingLearning4();
        Thread t2 = new Thread(tl2);
        tl2.run();
        tl1.run();
    }
}
