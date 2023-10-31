//Heap
//It is also a binary tree but it has sorted
//In this the root node have element only greater than as a child
//When we display it in an array we have a sorted array and we can perform addition, finding and removal in log n time
import java.util.ArrayList;

class Heap<T extends Comparable<T>>{
    private ArrayList<T> list ;
    public Heap(){
        list = new ArrayList<>();
    }
    private void swap(int first, int second){
        T temp = list.get(first);
        list.set(first,list.get(second));
        list.set(second,temp);
    }
    private int parent(int index){
        return (index-1)/2;
    }
    private int left(int index){
        return (index*2)+1;
    }
    private int right(int index){
        return (index*2)+2;
    }
    public void insert(T value){
        list.add(value);
        upheap(list.size()-1);
    }
    private void upheap(int n){
        if(n==0){
            return;
        }
        int p= parent(n);
        if(list.get(n).compareTo(list.get(p))<0){
            swap(n,p);
            upheap(p);
        }
    }
    public T remove() throws Exception{
        if(list.isEmpty()){
            throw new Exception("Your Heap is Empty!!");
        }
        T temp = list.get(0);
        T last = list.remove(list.size()-1);
        if(!list.isEmpty()){
            list.set(0,last);
            downHeap(0);
        }
        return temp;
    }
    private void downHeap(int index){
        int min= index;
        int left = left(index);
        int right = right(index);

        if(left<list.size()&&list.get(min).compareTo(list.get(left))>0){
            min = left;
        }
        if(right<list.size()&&list.get(min).compareTo(list.get(right))>0){
            min = right;
        }
        if(min!=index){
            swap(min,index);
            downHeap(min);
        }
    }
    public ArrayList<T> heapSort() throws Exception{
        ArrayList<T> data = new ArrayList<>();
        while (!list.isEmpty()){
            data.add(this.remove());
        }
        return data;
    }


}
public class DSA_59 {
    public static void main(String[] args)throws Exception {
        Heap<Integer> newList = new Heap<>();
        newList.insert(13);
        newList.insert(11);
        newList.insert(14);
        newList.insert(12);
        newList.insert(15);

        ArrayList ans =newList.heapSort();
        System.out.println(ans);
    }
}
