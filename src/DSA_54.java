//AVL Trees
//AVL Trees are the trees that are balanced
//Balanced means the number of the child in left vs the number of the child in right is equal or +1
//To make a unbalanced tree a balance
//We make use of the right and left rotate method
//In this we have a parent a child and one grandchild
//the parent is the one from where is the tree is unbalanced(that part )
//The child is the child of the parent and parent of the grandchild
//We then we have to make so that the parent is the child of the child
//There can be 4 situation
//1. left-left
//2. left-right
//3. right-right
//4. right-left

//The one and third can be solved by just right shift and left shift respectively
//Then in the second case we first have to do left shift and then right shift
//Then in the fourth case we first have to do right shift and then left shift

//We are making a automatically balance avl tree
//In this the structure of the tree won't change
//Its just accesssing the element will change
class AVL{
    private class Node21{
        private int value;
        private Node21 left;
        private Node21 right;
        private int height;
        public Node21(int value){
            this.value = value;
        }
        public int getValue(){
            return value;
        }
    }
    public AVL(){}
    private Node21 root;
    public int height(){
        return height(root);
    }
    public int height(Node21 node){
        if(node==null){
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty(){
        return root==null;
    }
    public void insert(int value){
        root= insert(root,value);
    }
    public Node21 insert(Node21 node, int value){
        if(node==null){
            root = new Node21(value);
            return root;
        }
        if(value<node.value){
            node.left = insert(node.left,value);
        }
        if(value>node.value){
            node.right = insert(node.right,value);
        }
        node.height = Math.max(height(node.right),height(node.left))+1;
        return rotate(node);

    }
    public Node21 rotate(Node21 node){
        if(height(node.left)-height(node.right)>1){
//            Left Heavy
            if(height(node.left.left)-height(node.left.right)>0){
                return rightRotate(node);
            }
            if(height(node.left.left)-height(node.left.right)>0){
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }
        if(height(node.left)-height(node.right)<-1){
//            Left Heavy
            if(height(node.right.left)-height(node.right.right)<0){
                return leftRotate(node);
            }
            if(height(node.right.left)-height(node.right.right)>0){
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }
    public Node21 leftRotate(Node21 c){
        Node21 p = c.right;
        Node21 t = p.left;
        p.left = c;
        c.right = t;
        p.height = Math.max(height(p.left),height(p.right)+1);
        c.height = Math.max(height(c.left),height(c.right)+1);
        return p;
    }
    public Node21 rightRotate(Node21 p){
        Node21 c = p.left;
        Node21 t = c.right;
        c.right = p;
        p.left = t;
        p.height = Math.max(height(p.left),height(p.right)+1);
        c.height = Math.max(height(c.left),height(c.right)+1);
        return c;

    }
    public boolean isBalanced(){
        return isBalanced(root);
    }
    public boolean isBalanced(Node21 node){
        if(node==null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right))<=1&&isBalanced(node.left)&&isBalanced(node.right);
    }
    public void populate(int []arr){
        for(int i=0;i<arr.length;i++){
            this.insert(arr[i]);
        }

    }
    public void display(){
        display(root,"Root Node is: ");
    }
    private void display(Node21 node, String details){
        if(node==null){
            return;
        }
        System.out.println(details+node.value);
        display(node.left,"Left child of : "+node.value+" : ");
        display(node.right,"Right child of : "+node.value+" : ");
    }
}
public class DSA_54 {
    public static void main(String[] args) {
        AVL tree = new AVL();
        for(int i=0;i<20;i++){
            tree.insert(i);
        }
        System.out.println(tree.height());
        tree.display();
    }
}
