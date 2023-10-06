//Dynamic Stack
//Here the array size gets double everytime stack is full
class customDyanmicStack extends customStack{

    public customDyanmicStack(){
        super();
    }
    public customDyanmicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int item) {
        if(isFull()){
            int[]temp = new int[data.length*2];
            for(int i=0;i< data.length;i++){
                temp[i] = data[i];
            }
            data = temp;
        }
        return super.push(item);
    }
}
public class DSA_46 {
    public static void main(String[] args)throws Exception {
        customDyanmicStack s1 = new customDyanmicStack(5);
        s1.push(20);
        s1.push(21);
        s1.push(22);
        s1.push(23);
        s1.push(24);
        s1.push(25);
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
    }

}
