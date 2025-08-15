public class Top150_110 {
    private class Node {
        public boolean val;
        public boolean isLeaf;
        public Node topLeft;
        public Node topRight;
        public Node bottomLeft;
        public Node bottomRight;


        public Node() {
            this.val = false;
            this.isLeaf = false;
            this.topLeft = null;
            this.topRight = null;
            this.bottomLeft = null;
            this.bottomRight = null;
        }

        public Node(boolean val, boolean isLeaf) {
            this.val = val;
            this.isLeaf = isLeaf;
            this.topLeft = null;
            this.topRight = null;
            this.bottomLeft = null;
            this.bottomRight = null;
        }

        public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
            this.val = val;
            this.isLeaf = isLeaf;
            this.topLeft = topLeft;
            this.topRight = topRight;
            this.bottomLeft = bottomLeft;
            this.bottomRight = bottomRight;
        }
    }
    public Node construct(int[][] grid) {
        return helper(grid,0,0,grid.length);
    }
    private Node helper(int[][]grid, int row, int col,int length){
        if(length==0)return new Node(grid[row][col]==1?true:false,true);
        Node topLeft = helper(grid,row,col,length/2);
        Node topRight = helper(grid,row,col+length/2,length/2);
        Node bottomLeft = helper(grid,row+length/2,col,length/2);
        Node bottomRight = helper(grid,row+length/2,col+length/2,length/2);
        if(topLeft.val==topRight.val&&bottomLeft.val==bottomRight.val&&topLeft.val==bottomLeft.val&&topLeft.isLeaf&&topRight.isLeaf&&bottomLeft.isLeaf&&bottomRight.isLeaf)return new Node(topLeft.val,true);
        else return new Node(true,false,topLeft,topRight,bottomLeft,bottomRight);
    }
}
