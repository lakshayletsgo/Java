public class ClassJava_61 {
    public static void main(String[] args) {
        towerOfHanoi(4,"S","H","D");
    }
    static void towerOfHanoi(int n, String src, String help, String dest){
        if(n==1){
            System.out.println("Transfer Disk from "+src+" to "+dest);
            return;
        }
        towerOfHanoi(n-1,src,dest,help);
        System.out.println("Transfer Disk from "+src+" to "+dest);
        towerOfHanoi(n-1,help,src,dest);
    }
}
