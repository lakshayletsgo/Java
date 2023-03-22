//Constructors in Threads

class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    public void run(){
        int i=0;
        System.out.println("Hello");
        while (i<20){
            System.out.println("This is method run in thread 1");
            i++;
        }
    }
}
public class Java_30 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Lakshay");
        t1.start();
        System.out.println("The id of the thread is "+t1.getId()); //This will give the id of the thread
        System.out.println("The name of the thread is "+t1.getName()); // This will give the name of the thread we have given
    }
}
