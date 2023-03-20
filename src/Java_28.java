//Multithreading
//Multithreading is like sync and async programmes
// Isme agar do programme pe threading lagai toh jiska kaam ho jayega voh run ho jayega aur jo time lega voh baad me run hoga
// This is multithreading by extending thread class

class ThreadingLearning1 extends Thread{
    public void run(){
        int j = 0;

        while (j<20){
            j++;
        System.out.println("This is class 1 of thread");
        System.out.println("This is sample 1");
    }}
}

class ThreadingLearning2 extends Thread{
    public void run(){
        int i=0;
        while(i<20){
            i++;
        System.out.println("This is class 2 of thread");
        System.out.println("This is sample 2");
    }}
}
public class Java_28 {
    public static void main(String[] args) {
        ThreadingLearning1 t1=  new ThreadingLearning1();
        ThreadingLearning2 t2=  new ThreadingLearning2();
        t1.start();
        t2.start();
    }
}
