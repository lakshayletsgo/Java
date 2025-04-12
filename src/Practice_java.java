import com.sun.source.tree.Tree;

import java.sql.Array;
import java.util.*;
public class Practice_java {
    private class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
    public static void main(String[] args) {
    }
    public int maxArea(int[] height) {
        int maxArea = 0,s=0,e=height.length;
        while (s<e){
            maxArea= Math.max(maxArea,Math.min(height[s],height[e])*(e-s));
            if (height[s]>height[e])e--;
            else s++;
        }
        return maxArea;
    }

    }
