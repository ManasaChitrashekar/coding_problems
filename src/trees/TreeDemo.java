package trees;

public class TreeDemo {
    public static void main(String args[])
    {
        Node root = new Node(10);
        root.addNode(6);
        root.addNode(8);
        root.addNode(25);
        root.addNode(60);
        root.addNode(-1);

        root.inorder();
        System.out.println(root.contains(60));
        System.out.println(root.contains(10));
        System.out.println(root.contains(0));
    }
}
