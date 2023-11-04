//File Encoder and Decorder
//This is a working file encoder and decorder
//In this we just have to give the input file name and we get a encoded message we can decode it to get the original message

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FileEncoderDecorder {
    public static void main(String[] args) throws Exception{
//        System.out.println("New File with name: "+fileEncoder("Input12.txt"));
        System.out.println("New File with name: "+fileDecorder("Output12.txt","Input12.txt"));

    }



    public static String fileEncoder(String fileName)throws Exception{
        String fileName12 = "Output12.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
            File newFile = new File(fileName12);
            FileWriter fw  = new FileWriter(newFile);
            while (br.ready()){
                String line = br.readLine();
                HuffmanCoder3 hf = new HuffmanCoder3(line);

                String encoded = hf.encode(line);
//                System.out.println(encoded);
                fw.write(encoded);
            }
            fw.close();
            br.close();

        }catch (Exception e){
            System.out.println(e);
        }
        return fileName12;
    }
    public static String fileDecorder(String fileName, String orgi)throws Exception{
        String fileName12 = "Output13.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(orgi))){
            File newFile = new File(fileName12);
            FileWriter fw  = new FileWriter(newFile);
            BufferedReader fw2 = new BufferedReader(new FileReader(fileName));
            while (br.ready()){
                String line = br.readLine();
                HuffmanCoder3 hf = new HuffmanCoder3(line);
                String line2 = fw2.readLine();
                System.out.println(line2);
                String encoded = hf.decode(line2);
                System.out.println(encoded);
                fw.write(encoded);
            }
            fw.close();
            fw2.close();
            br.close();

        }catch (Exception e){
            e.printStackTrace();
        }
        return fileName12;
    }
}
class HuffmanCoder3 {
    private HashMap<Character, String> encoder;
    private HashMap<String, Character> decorder;

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
    public HuffmanCoder3(String feeder)throws Exception{
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
