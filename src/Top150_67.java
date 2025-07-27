import java.util.*;
public class Top150_67 {
    private class LRUCache {
        private class Node{
            Node prev, next;
            int val, key;
            public Node(int key,int val){
                this.key =key;
                this.val = val;
            }
        }
        Map<Integer,Node> map;
        int capacity;
        Node head,tail;
        public LRUCache(int capacity) {
            this.map = new HashMap<>();
            this.capacity = capacity;
            head = new Node(0,0);
            tail = new Node(0,0);
            head.next = tail;
            tail.prev = head;
        }

        public int get(int key) {
            if(map.containsKey(key)){
                Node temp = map.get(key);
                remove(temp);
                add(temp);
                return temp.val;
            }
            return -1;
        }

        public void put(int key, int value) {
            if(map.containsKey(key))remove(map.get(key));
            if(map.size()==capacity)remove(tail.prev);
            add(new Node(key,value));
        }
        private void remove(Node node){
            map.remove(node.key);
            node.prev.next= node.next;
            node.next.prev = node.prev;
        }
        private void add(Node node){
            map.put(node.key,node);
            node.next = head.next;
            node.prev = head;
            head.next.prev = node;
            head.next = node;
        }
    }


}
