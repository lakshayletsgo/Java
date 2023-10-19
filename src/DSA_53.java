//Traversal In Binary Tree

public class DSA_53 {
    public void preOrder(Node node){
        if(node==null){
            return;
        }
        System.out.println(node.value+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public void inOrder(Node node){
        if(node==null){
            return;
        }
        preOrder(node.left);
        System.out.println(node.value+" ");
        preOrder(node.right);
    }
    public void postOrder(Node node){
        if(node==null){
            return;
        }
        preOrder(node.left);
        preOrder(node.right);
        System.out.println(node.value+" ");
    }
    public static void main(String[] args) {

    }
}
