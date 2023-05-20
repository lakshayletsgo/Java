class RollNumber{
    int number;
    RollNumber(){
        number = 0;
    }
    RollNumber(int x){
        this.number = x;
    }
}
public class Main {
    public static void main(String[] args) {
        RollNumber [] arr = new RollNumber[10];
        arr[0] = new RollNumber();
        arr[1] = new RollNumber(10);
        arr[2] = new RollNumber();
        System.out.println(arr[1].number);
    }
}