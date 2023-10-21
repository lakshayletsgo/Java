//Segment Trees
//This is used when we want to work with some range
//For eg we have to take the maximum of any range or we have to take sum of any given range in log n time
//In this every node has two things
//1. Operation like total of it
//2. Index of that

class SegmentTree{
    private class Node{

        int value;
        Node left;
        Node right;
        int startInterval;
        int endInterval;
        public Node(int startInterval, int endInterval){
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }
    Node root;
    public SegmentTree(int[]arr){
        this.root = constructTree(arr,0,arr.length-1);
    }
    private Node constructTree(int []arr, int start, int end){
        if(start==end){
            Node newNode = new Node(start,end);
            newNode.value = arr[start];
            return newNode;
        }
        Node node = new Node(start,end);
        int mid = (start+end)/2;
        node.left = this.constructTree(arr,start,mid);
        node.right = this.constructTree(arr,mid+1,end);
        node.value = node.left.value+node.right.value;
        return node;

    }
    public void display(){
        display(this.root);
    }
    private void display(Node node){
        String str  = "";
        if(node.left!=null){
            str = str+"Interval = ["+node.left.startInterval+"-"+node.left.endInterval+"] and data : "+node.left.value+" --> ";
        }else{
            str = str+"No Left Child --> ";
        }
        str = str+"Interval = ["+node.startInterval+"-"+node.endInterval+"] and data : "+node.value+" <-- ";
        if(node.right!=null){
            str = str+"Interval = ["+node.right.startInterval+"-"+node.right.endInterval+"] and data : "+node.right.value;
        }else{
            str = str+"No Right Child";
        }
        System.out.println(str+"\n");
        if(node.left!=null){
            display(node.left);
        }
        if(node.right!=null){
            display(node.right);
        }

    }
    public int query(int qsi, int qei){
        return query(root,qsi,qei);
    }
    private int query(Node node, int qsi, int qei){
        if(node.startInterval>=qsi&&node.endInterval<=qei){
            return node.value;
        } else if (node.startInterval>qei||node.endInterval<qsi) {
            return 0;
        }else{
            return this.query(node.left,qsi,qei)+this.query(node.right,qsi,qei);
        }
    }
    public void update(int index,int value){
        this.root.value = update(this.root,index,value);
    }
    private int update(Node node,int index, int value){
        if(index>=node.startInterval&&index<=node.endInterval){
            if(index==node.startInterval&&index==node.endInterval){
                node.value = value;
                return node.value;
            }else{
                int leftAns = update(node.left,index,value);
                int rightAns = update(node.right,index,value);
                node.value = leftAns+rightAns;
                return node.value;
            }
        }
        return node.value;
    }
}
public class DSA_55 {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,7,8,9,10,11,12};
        SegmentTree tree= new SegmentTree(arr);
//        tree.display();
        System.out.println(tree.query(2,3));
    }
    
}
