//Tower of Hanoi
public class DSA_37 {
    public static void main(String[] args) {
        towerOfHanoi(1,"S","H","D");
    }
    static void towerOfHanoi(int n,String src,String hel, String dest){
        if(n==1){
            System.out.println("Transfer Disk from "+src+" to "+dest);
        }
        towerOfHanoi(n-1,src,dest,hel);
        System.out.println("Transfer Disk from "+src+" to "+dest);
        towerOfHanoi(n-1,hel,src,dest);
    }
}
