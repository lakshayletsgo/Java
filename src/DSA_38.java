import java.util.Arrays;

//Custom ArrayList
class ArrayList3{
    private int size;
    private static int Default_Size = 10;
    private int []data;
    public ArrayList3(){
        data = new int[Default_Size];
    }
    public void add(int n){
        if(isFull()){
            resize();
        }
        data[size++]= n;
    }
    private boolean isFull(){
        return size==data.length;
    }
    private void resize(){
        int []temp = new int[data.length*2];
        for(int i=0;i<data.length;i++){
            temp[i] = data[i];
        }
        data = temp;
    }
    public int remove(){
        int rem = data[--size];
        return rem;
    }
    public int get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index, int n){
        data[index] = n;
    }
    @Override
    public String toString(){
        return "NewList data = "+ Arrays.toString(data)+" and size = "+size;
    }
}
public class DSA_38 {
    public static void main(String[] args) {
        ArrayList3 list = new ArrayList3();
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        System.out.println(list);
    }
}
