package trees;

public class DepthOfBinaryTree {
    public static int nodeDepths(Node root, int i) {
        // Write your code her.
        int nodeDepth = nodeDepth(root,0);
        return nodeDepth;
    }

    private static int nodeDepth(Node root, int depth) {
        if(root == null)
            return 0;
        return depth+nodeDepths(root.left,depth+1)+nodeDepths(root.right,depth+1);
    }
}
