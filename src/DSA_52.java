//Binary Search Tree
class BST{
    private class Node {
        private int value;
        private Node right;
        private Node left;
        private int height;
        public Node(int value){
            this.value = value;
        }
        public int getValue(){
            return value;
        }
    }
    private Node root;
    public BST(){

    }
    public int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty(){
        return root==null;
    }
    public void insert(int value){
        root = insert(root,value);
    }
    private Node insert( Node node,int value){
        if(node==null){
            node = new Node(value);
            return node;

        }
        if(value<node.value){
            node.left = insert(node.left, value);
        }
        if(value>node.value){
            node.right = insert(node.right, value);
        }
        node.height = Math.max(height(node.left),height(node.right))+1;
        return node;
    }
    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if(node==null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right))<=1&&balanced(node.left)&&balanced(node.right);
    }
    public void populate(int[]nums){
        for(int i=0;i<nums.length;i++){
            this.insert(nums[i]);
        }
    }
    public void display(){
        display(root,"Root Node is: ");
    }
    private void display(Node node, String details){
        if(node==null){
            return;
        }
        System.out.println(details+ node.value);
        display(node.left,"Left Child of : "+node.value+" : ");
        display(node.right,"Right Child of : "+node.value+" : ");
    }


}
public class DSA_52 {
}
