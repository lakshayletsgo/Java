//Methods in Threads
class NewThread extends Thread{
    public void run(){
        while(true){
            System.out.println("This thread 1 ");
            try {

//                Isse ham kuch time me delay daal skte hai
//                Isme ab yeh thread 700 milisecond ke baad hi chalega
//                Aur maine jaise neeche join laga rkha hai toh pehle yeh wala hi thread chalta rahega
                Thread.sleep(700);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}class NewThread2 extends Thread{
    public void run(){
        while(true){
            System.out.println("This thread 2 ");
        }
    }
}
public class Java_31 {
    public static void main(String[] args) {
        NewThread n1 = new NewThread();
        NewThread2 n2 = new NewThread2();
        n1.start();
        try {
            n1.join(); //This is to show that start n2 after n1 is completed
        }catch (Exception e){
            System.out.println(e);
        }
//        To solve this error we have to catch the exception


        n2.start();
//        n2.run();   This won't show thread behavior as it will just run the run method and not the thread
    }
}
