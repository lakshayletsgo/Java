//Custom Generic ArrayList
import java.text.CharacterIterator;
import java.util.Arrays;

class CustomGenericArrayList<T>{
    private Object []data;
    private static int defaultSize= 10;
    private int size = 0;
    public CustomGenericArrayList(){
        data = new Object[defaultSize];

    }

    public void add(T num){
        if(isFull()){
            reSize();
        }
        data[size++] = num;
     }

    private void reSize() {
        Object []temp = new Object[data.length*2];
        for(int i=0;i<data.length;i++){
            temp[i] = data[i];
        }
        data= temp;
    }


    private boolean isFull() {
        return size==data.length;
    }
    public T remove(){
        T rem = (T)(data[--size]);
        return rem;
    }
    public int size(){
        return size;
    }
    public T get(int index){
        return (T)(data[index]);
    }
    public void set(int index, T value){
        data[index] = value;
    }
    public String toString(){
        return "Your List is : "+ Arrays.toString(data)+" and length is: "+size;
    }

}
public class DSA_39 {
    public static void main(String[] args) {
        CustomGenericArrayList<Integer> newList = new CustomGenericArrayList<>();
        newList.add(23);
        newList.add(26);
        newList.add(27);
        newList.add(28);
        System.out.println(newList);
    }

}
