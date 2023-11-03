//HuffMan Encoder and Decorder
//It is used to encode the message and make it small and make it unreadable
//We do this by converting the msg to a binary representation
//We then maintain a table on which we can decode the msg

import java.util.*;
import java.util.Map;

import java.util.Set;

//HuffMan Coder
//It is used to compress a file
class HuffmanCoder{
    HashMap<Character, String> encoder;
    HashMap<String, Character> decorder;

    private class Node implements Comparable<Node>{
        Character data;
        int cost;
        Node left;
        Node right;

        public Node(Character data, int cost){
            this.data = data;
            this.cost =cost;
            this.left=  null;
            this.right=  null;
        }

        public int compareTo(Node other){
            return this.cost-other.cost;
        }

    }
    public HuffmanCoder(String feeder)throws Exception{
        HashMap<Character,Integer> fmap = new HashMap<>();

        for(int i=0;i<feeder.length();i++){
            char cc = feeder.charAt(i);
            if(fmap.containsKey(cc)){
                int ov= fmap.get(cc);
                ov+=1;
                fmap.put(cc,ov);
            }else{
                fmap.put(cc,1);
            }
        }
        Heap2<Node> minHeap = new Heap2<>();
        Set<Map.Entry<Character,Integer>> entrySet = fmap.entrySet();
        for(Map.Entry<Character,Integer> entry:entrySet){
            Node node = new Node(entry.getKey(),entry.getValue());
            minHeap.insert(node);
        }
        while (minHeap.size()!=1){
            Node first = minHeap.remove();
            Node second = minHeap.remove();

            Node newNode = new Node('\0', first.cost+second.cost);
            newNode.left = first;
            newNode.right = second;
            minHeap.insert(newNode);
        }
        Node ft = minHeap.remove();
        this.encoder = new HashMap<>();
        this.decorder = new HashMap<>();

        this.initEncoderDecorder(ft,"");
    }
    private void initEncoderDecorder(Node node, String osf){
        if(node==null){
            return;
        }
         if(node.left==null&&node.right==null){
             this.encoder.put(node.data,osf);
             this.decorder.put(osf,node.data);
         }
         initEncoderDecorder(node.left, osf+"0");
         initEncoderDecorder(node.right, osf+"1");
    }
    public String encode(String source){
        String ans = "";
        for(int i=0;i<source.length();i++){
            ans+=encoder.get(source.charAt(i));
        }
        return ans;

    }
    public String decode(String source){
        String key = "";
        String ans = "";
        for(int i=0;i<source.length();i++){
            key+=source.charAt(i);
            if(decorder.containsKey(key)){
                ans += decorder.get(key);
                key="";
            }
        }
        return ans;

    }

}
public class DSA_67 {
    public static void main(String[] args)throws Exception {
        String msg = "asafgdas";
        HuffmanCoder newCode = new HuffmanCoder(msg);
        String cs = newCode.encode(msg);
        System.out.println(cs);
        String es= newCode.decode(cs);
        System.out.println(es);
    }


}
