//Final Hash Map
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class hashUsingLink<K,V>{
    ArrayList<LinkedList<Entities>> list;
    private int size= 0;
    private float lf=  0.5f;


    public hashUsingLink(){
        list = new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(new LinkedList<>());
        }

    }
    public void put(K key, V val){
        int hash = Math.abs(key.hashCode()%list.size());

        LinkedList<Entities> entities = list.get(hash);

        for(Entities entity:entities){
            if(entity.key.equals(key)){
                entity.val = val;
                return;
            }
        }
        if((float)(size)/ list.size()>lf){
            rehash();
        }
        entities.add(new Entities(key,val));
        size++;
    }
    private void rehash(){
        System.out.println("We are rehashing now!!");

        ArrayList<LinkedList<Entities>> old = list;

        list= new ArrayList<>();
        size=0;
        for(int i=0;i<old.size()*2;i++){
            list.add(new LinkedList<>());
        }
        for(LinkedList<Entities> entities:old){
            for(Entities entitt: entities){
                put(entitt.key,entitt.val);
            }
        }
    }

    public V get(K key){
        int hash = Math.abs(key.hashCode()%list.size());
        LinkedList<Entities> entities= list.get(hash);
        for(Entities entities1: entities){
            if(entities1.key.equals(key)){
                return entities1.val;
            }
        }
        return null;}
    public void remove(K key){
        int hash = Math.abs(key.hashCode()%list.size());
        LinkedList<Entities> entities = list.get(hash);
        Entities target = null;
        for(Entities entities1: entities){
            if(entities1.key.equals(key)){
                target = entities1;
                break;
            }
        }
        entities.remove(target);
        size--;

    }
    public boolean containsKey(K key){
        return get(key)!=null;
    }
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        for(LinkedList<Entities> entities:list){
            for(Entities entities1: entities){
                builder.append(entities1.key);
                builder.append(" = ");
                builder.append(entities1.val);
                builder.append(" , ");
            }
        }
        builder.append("}");
        return builder.toString();
    }

    private class Entities{
        V val;
        K key;

        public Entities(K key,V val){
            this.val = val;
            this.key = key;
        }

    }
}
public class DSA_62 {
    public static void main(String[] args) {
        hashUsingLink<String, Integer> list= new hashUsingLink<>();
        list.put("Lakshay",99);
        list.put("Rahul",95);
        list.put("Mohan",92);

        System.out.println(list);
    }

}
