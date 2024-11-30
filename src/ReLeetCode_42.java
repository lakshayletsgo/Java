//import java.util.HashMap;
//
//class LRUCache {
//    HashMap<Integer,Integer> cache;
//    int capcity;
//    int key;
//    public LRUCache(int capacity) {
//        cache = new HashMap<>();
//        this.capcity = capacity;
//    }
//
//    public int get(int key) {
//        key = key;
//        return cache.getOrDefault(key, -1);
//
//    }
//
//    public void put(int key, int value) {
//        if (capcity<=cache.size()){
//            cache.remove(key);
//        }
//        cache.put(key,value);
//        this.key = key;
//
//    }
//}


import java.util.HashMap;
import java.util.Map;

class LRUCache {
    private class Node{
        Node prev,next;
        int key,value;
        Node(int key,int val){
            this.key = key;
            this.value = val;
        }
    }
    Node head = new Node(0,0),tail = new Node(0,0);
    Map<Integer,Node> map = new HashMap<>();
    int capacity;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (map.containsKey(key)){
            Node data = map.get(key);
            remove(data);
            insert(data);
            return data.value;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)){
            remove(map.get(key));
        }
        if (capacity ==map.size()){
            remove(tail.prev);
        }
        insert(new Node(key,value));
    }
    void insert(Node node){
        map.put(node.key,node);
        Node headNxt = head.next;
        head.next= node;
        node.prev = head;
        headNxt.prev = node;
        node.next = headNxt;
    }
    void remove(Node node){
        map.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
}
public class ReLeetCode_42 {
    public static void main(String[] args) {

    }
    
}
