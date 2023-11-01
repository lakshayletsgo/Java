//Custom Hash Map
//It is not efficient HashMap so we have can create a linkedlist representation of the HashMap
class customHash{
    private Entity[] entities;

    public customHash(){
        entities = new Entity[100];
    }
    public void put(String key, String val){
        int hash = Math.abs(key.hashCode()%this.entities.length);
        entities[hash] = new Entity(key,val);

    }
    public String get(String key){
        int hash = Math.abs(key.hashCode()%entities.length);
        if(entities[hash]!=null&&entities[hash].key.equals(key)){
            return entities[hash].val;
        }
        return null;

    }
    public void remove(String key){
        int hash = Math.abs(key.hashCode()%entities.length);
        if(entities[hash]!=null&&entities[hash].key.equals(key)){
            entities[hash]=null;
        }
    }


    private class Entity{
        String key;
        String val;
        public Entity(String key, String val){
            this.key = key;
            this.val = val;
        }
    }
}
public class DSA_61 {
    public static void main(String[] args) {
        customHash list = new customHash();
        list.put("Lakshay","45");
        list.put("Rahul","46");
        list.put("Rohan","41");
        System.out.println(list.get("Rahul"));
    }
}
